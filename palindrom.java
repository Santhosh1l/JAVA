import java.util.Scanner;
public class palindrom {
    public static void main(String args[]){
        int r,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int n= s.nextInt();
        int temp=n;

        while(n>0){
            r=n%10;  //getting remainder
          sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}



