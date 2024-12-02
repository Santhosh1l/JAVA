import java.util.Scanner;
public class no_of_even_odd {
    public static void main(String[] args) {
        int e=0,o=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the no of array");
        int n= s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the value of the array");
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                e++;
            }
            else{
                o++;
            }

        }System.out.println(e);
        System.out.println(o);

    }
}
