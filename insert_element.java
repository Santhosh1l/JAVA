import java.util.Scanner;
public class insert_element {
    public static void main(String[] args) {
        int[] arr= {12,33,44,55,66,77,88,99};
        int index=2;
        int value=55;
        for(int i= arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=value;
        System.out.println(arr);
    }
}
