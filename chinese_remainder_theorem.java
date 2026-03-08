// To find the smallest number x such that:
// x % a1 = r1
// x % a2 = r2
// ...
// x % ak = rk

public class chinese_remainder_theorem{

    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static int modInverse(int a, int m){
        a = a % m;
        for(int x = 1; x < m; x++){
            if((a * x) % m == 1) return x;
        }
        return -1;
    }

    public static int chineseRemainderTheorem(int[] a, int[] r, int k){
        int prod = 1;
        for(int i=0; i<k; i++){
            prod *= a[i];
        }

        int result = 0;

        for(int i=0; i<k; i++){
            int pp = prod / a[i];
            result += r[i] * modInverse(pp, a[i]) * pp;
        }

        return result % prod;
    }

    public static void main(String[] args) {
        int[] a = {3,5,7};
        int[] r = {2,3,2};
        int k = a.length;

        System.out.println("The smallest number is " + chineseRemainderTheorem(a, r, k));
    }
}