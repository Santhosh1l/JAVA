   //delete the first and last element in the array


import java.util.Scanner;

public class fldeleyt {


    public static void main(String[] args) {
        int i;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int m=n.nextInt();

        int arr[]=new int[m];
        System.out.println("Enter the element in the array");
        for( i=0;i<m;i++){
            arr[i]=n.nextInt();

        }
        int[] newArr = new int[m - 2];
        for ( i = 1; i < m - 1; i++) {
            newArr[i - 1] = arr[i];
        }

        System.out.println("Array after deleting first and last elements:");
        for ( i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

}
