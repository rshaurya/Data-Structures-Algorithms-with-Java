// Sieve of Erathosthenes: print prime numbers up to n

//Brute force approach: check for each number from 2 to n if it is prime or not. Time complexity: O(n*sqrt(n))

// Optimised approach: Sieve of Erathosthenes: Time complexity: O(n*log(log(n)))


public class simple_sieve {

    public static void simpleSieve(int n){
        boolean[] prime = new boolean[n+1];

        for(int i=0; i<=n; i++){
            prime[i] = true;
        }
        for(int i=2; i*i <= n; i++){
            if(prime[i] == true){
                for(int j = i*i; j<= n;j+=i){
                    prime[j] = false;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(prime[i] == true){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 30;
        simpleSieve(n);
    }
    
}
