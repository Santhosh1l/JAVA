import java.util.Scanner;
public class fibonacci_series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int n = s.nextInt();
int a=0;
int b=1;
        if (n == 0) {
            System.out.println(a);
        }
        else{
            for(int i=1;i<=n;i++){
                int next=a+b;
                a=b;
                b=next;
                System.out.print(a+" ");
            }
        }
    }
}