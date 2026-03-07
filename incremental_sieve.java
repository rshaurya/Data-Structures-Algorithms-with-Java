import java.util.*;

public class incremental_sieve {

    public static List<Integer> generatePrimes(int limit) {
        // generate primes using incremental sieve
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> primes = new ArrayList<>();

        primes.add(2);

        for (int num = 3; num <= limit; num++) {

            if (!map.containsKey(num)) {

                primes.add(num);

                map.put(num * num, 2 * num);

            } else {

                int step = map.get(num);
                map.remove(num);

                int next = num + step;

                while (map.containsKey(next)) {
                    next += step;
                }

                map.put(next, step);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        int limit = 50;
        List<Integer> primes = generatePrimes(limit);
        System.out.println(primes);
    }
}