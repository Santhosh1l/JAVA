
import java.util.Scanner;
class gcd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scan.nextInt();


        System.out.println( getGCD(num1,num2))  ;  }
    public static int  getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }

}