import java.util.Scanner;

public class PascalRow_print {

    public static void main(String[] args) {
        int n=5;
        ncr(n);
        System.out.println("enter n");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        ncr(n);
        System.out.println();
    }
    static void ncr(int n){
        int res=1;
        System.out.print(res+" ");
        for(int i=1;i<n;i++){
            res=res*(n-i);
            res=res/(i);
            System.out.print(res+" ");
        }
        System.out.println();

    }

}