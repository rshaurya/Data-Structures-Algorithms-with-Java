// use segmented sieve to find all prime numbers in a given range [m, n]

import java.util.*;

public class segmented_sieve {

    public static List<Integer> simpleSieve(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        for(int i=2; i*i <= n; i++){
            if(prime[i] == true){
                for(int j = i*i; j<= n; j+=i){
                    prime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for(int i=2; i<=n; i++){
            if(prime[i] == true){
                primes.add(i);
            }
        }
        return primes;
    }

    static void segmentedSieve(int m, int n) {

        int limit = (int)Math.sqrt(n) + 1;
        List<Integer> primes = simpleSieve(limit);

        boolean[] segment = new boolean[n - m + 1];
        Arrays.fill(segment, true);

        for (int p : primes) {

            int start = Math.max(p * p, ((m + p - 1) / p) * p);

            for (int j = start; j <= n; j += p) {
                segment[j - m] = false;
            }
        }

        if (m == 1) segment[0] = false;

        for (int i = 0; i < segment.length; i++) {
            if (segment[i]) {
                System.out.print((i + m) + " ");
            }
        }
    }

    public static void main(String[] args) {
        int m = 10, n = 50;
        segmentedSieve(m, n);
    }

}