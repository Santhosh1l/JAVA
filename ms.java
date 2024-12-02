import java.util.*;
public class ms {
    public static void main(String[] args) {
        int arr[]= {4,5,6,3,7,2};
        int n= arr.length;
        mergesor(arr,0,n-1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void mergesor(int arr[],int low,int high){
        if(low>=high){
            return ;}
            int mid = (low + high) / 2 ;
        mergesor(arr,low,mid);
        mergesor(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge( int arr[],int low ,int mid,int high){
        ArrayList<Integer> temp= new ArrayList<Integer> ();
        int left= low;
        int right= mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }

    }
}
