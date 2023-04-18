import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrequencyPrimes {

    // S_16 set of prime ns 2^16
    final int[] primens = { 2, 3, 5 , 7 , 11 , 13 ,17 , 19 ,
                        23 , 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
                        71, 73, 79, 83, 89, 97, 101, 103, 107, 109,
                        113, 127, 131, 137, 139, 149, 151, 157, 163, 167,
                        173, 179, 181, 191, 193, 197, 199, 211, 223, 227,
                        229, 233, 239, 241, 251} ;


    // method for the prime factorization of n
    private static List<Integer> factorization(int n) {
        List<Integer> primeFactors = null;
        if (n < 256) {

            primeFactors = new ArrayList<Integer>();
            for (int i = 2; i <= n / i; i++) {
                while (n % i == 0) {
                    primeFactors.add(i);
                    n /= i;
                }
            }
            if (n > 1) {
                primeFactors.add(n);
            }
        }
        return primeFactors;
    }



    public static void main(String[] args) {

        System.out.println("# Start # \n\n set n that you want know the frequency of prime ns in S16 ");

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        List<Integer> primeFactors = factorization(n);
        
        // sanity check
        System.out.println(primeFactors);

    }


}


