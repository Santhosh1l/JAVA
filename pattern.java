import java.sql.SQLOutput;
import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();


//  printpatten1(n);
// printpatten2(n);
// printpatten3(n);
//  printpatter4(n);
 // pattern5(n);
  // printpattern6(n);
           // printpattern7(n);
         //   printpatter8(n);
//            printhalfbutterfly(n);  //pattern3 + pattern 4 is half butterfly

             printpractice(n);
        }

    }


    static void printpractice(int n) {
for(int i=1;i<=n;i++){
    char ch=(char)('A'+i-1);
    for(int j=0;j<i;j++){
        System.out.print(ch);
    }
    System.out.println();
}


         }

static void printpatter8(int n){
        for(int i=1;i<=n;i++){
            for(char j='A';j<='A'+n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
        static void printpattern7(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<2*n-2*i;j++){
                System.out.print
                        ("_");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

        }

    static void printpattern6(int n){
        System.out.println("patter6");
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j =n ; j >= 1; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <=  2*n-2*i+1; j++) {
                System.out.print("*");
            }

         //   System.out.println();

        }
    }


    static void pattern5(int n){
        int counter=1;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(counter);
            counter++;
            }
        }

    }
    static void printpatter4(int n){
        System.out.println("Patter4");
        for(int i=1;i<=n;i++){   // for(int i=1;i<=n;i++)
            for(int j=1;j<=n-i+1;j++){ // for(int j=1;j<=n-i+1;j++)
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void printpatten3 ( int n){
        System.out.println("pattern3");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                //   System.out.print(j);
            }
            System.out.println();
        }
    }
        static void printpatten2 ( int n){
            System.out.println("pattern2");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {

                    System.out.print(j + " ");


                }
                System.out.println();
            }

        }

        static void printpatten1 ( int n) {
            System.out.println("Patter1");
            for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
                System.out.println();
            }
        }


            static void printhalfbutterfly ( int n){
                int i;
                for (i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("#");
                    }
                    System.out.println();
                }
                for (i = n - 1; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("#");
                        //   System.out.print(j);
                    }
                    System.out.println();
                }
            }
        }
