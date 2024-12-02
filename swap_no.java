import java.util.Scanner;
public class swap_no{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the first value:");

        int a=s.nextInt();
        System.out.println("Enter the Second value:");
        int b= s.nextInt();
        a=a^b; /* a= a+b; b=a-b; a=a-b   */
        b=a^b;
        a=a^b;
        System.out.println("a:\t" +a+ "\nb:\t"+b);
    }
}