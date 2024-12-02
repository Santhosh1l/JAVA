import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the total numbers:");
        int n = a.nextInt();
        int sum=0;
        for(int i =1;i<=n;i++){
            System.out.println("Enter the "+i+" element");
            int m = a.nextInt();
             sum +=m;
        }
        System.out.println("The average of the number:"+(sum/n));
    }
}
