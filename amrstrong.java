import java.util.Scanner;
public class amrstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number :  ");
        int num = s.nextInt();
        int sum=0,temp=0;
        while (temp> 0)
        {
            temp =sum;
            int digit = temp % 10;
            sum += (digit * digit * digit);
            temp /= 10;
        }

        if (num ==sum) {
            System.out.println("it is amstrong"+sum);
        } else {
            System.out.println("not a amstrong"+sum);
        }

    }
}