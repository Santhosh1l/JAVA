// Harsad number


import java.util.Scanner;
public class harsadnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int arr[]={2,3,5,6};
System.out.println("enter the search element");
int n= scanner.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println(i);
            }

        }

    }
}