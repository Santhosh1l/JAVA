import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class sumofprime {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to check if a number can be expressed as the sum of two primes
    public static boolean isSumOfPrimes(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (isPrime(i) && isPrime(number - i)) {
                System.out.println(number + " can be expressed as the sum of " + i + " and " + (number - i));
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.println("Enter the number");
        int number = n.nextInt(); // Change this number to check other values
        if (!isSumOfPrimes(number)) {
            System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
        }
    }
}
