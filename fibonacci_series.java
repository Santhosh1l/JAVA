import java.util.Scanner;
public class fibonacci_series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int n = s.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        if (n == 0) {
            System.out.println(a);
        } else {
            for (int i = 1; i <= n; i++) {
                int nextTerm = a + b;
                b = a;
                a = nextTerm;
                System.out.print("\t" + a);
            }
        }

    }
}