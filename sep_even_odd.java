import java.util.Scanner;

public class sep_even_odd {

    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = n.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the element");
        for(int i=0;i<size;i++){
            arr[i]=n.nextInt();
        }


        //Logic for even array elements
        System.out.println("Even numbers are:");
        for(int i=0; i<size; i++){
            if(arr[i]%2==0){

                //separates even numbers
                System.out.print(arr[i]+" ");
            }
        }

        //Logic for odd array elements
        System.out.println("\nOdd numbers are:");
        for(int i=0; i<size; i++){
            if(arr[i]%2==1){

                //separates odd numbers
                System.out.print(arr[i]+" ");
            }
        }


    }
}
