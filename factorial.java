import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=s.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=i*fact;
        }
        System.out.println("factorial\t"+fact);
    }
}
