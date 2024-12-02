import java.util.Scanner;

public class combination {
    public static void main(String[] args) {


    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int r=sc.nextInt();
        System.out.println(ncr(n,r));

}
static int ncr(int n,int r){
    n=n-1;
    r=r-1;
    int res=1;
    for(int i=0;i<r;i++){
        res*=(n-i);
        res/=i+1;
    }

    return res;

}
}


