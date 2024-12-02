import java.util.Scanner;

public class SumOfMid {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int arr1[]={1,2,4,5,5};
        int arr2[]={2,4,5,6};
        int mid1 =arr1[arr1.length/2];
        int mid2=arr2[arr2.length/2];
        int sum=mid1+mid2;

        System.out.println(sum);
    }
}

