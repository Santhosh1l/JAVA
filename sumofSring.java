import java.util.Scanner;

public class sumofSring {


    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        String num1= sc.nextLine();
        String num2= sc.nextLine();
        int i= Integer.parseInt(num1);
        int j= Integer.parseInt(num2);
        int sum= i+j;
        System.out.println(sum);
        System.out.println(String.valueOf(sum));

    }
}