import java.util.ArrayList;
import java.util.Arrays;

public class rearrangPositiveNegative {
    public static void main(String[] args) {

        int arr[]={4,-1,9,3,-9,-8};
        int n= arr.length;
    rearrage(arr,n);
    }
    static void rearrage(int arr[], int n){
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer>neg = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
            else {
                neg.add(arr[i]);
            }
        }


int i=0,j=0,k=0;
        System.out.println(neg);
        while (i < pos.size() && j < neg.size()) {
            arr[k++]=pos.get(i++);
            arr[k++]=neg.get(j++);
        }
        while (i < pos.size()) {
            arr[k++]=pos.get(i++);
            //arr.set(k++, pos.get(i++));
        }

        // If there are remaining negative numbers, add them to the array
        while (j < neg.size()) {
            arr[k++]=neg.get(j++);
        //    arr.set(k++, neg.get(j++));
        }

        System.out.println(Arrays.toString(arr));
    }

}
