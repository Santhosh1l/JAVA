import java.util.ArrayList;

public class CountSubarraywithSum {


    public static void main(String[] args) {
        int[]arr={2,3,1,4,5,6};
        int k=6;
        int cnt= findallsubarray(arr,k);
        System.out.println(cnt);
    }
    static int findallsubarray(int arr[],int k){

        int n= arr.length;
     //   int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            ArrayList<Integer> subarray= new ArrayList<>();
            for(int j=i;j<n;j++){
                sum+=arr[j];
                subarray.add(arr[j]);
                if(sum==k){
                    count++;
                    System.out.println(subarray);
                }

            }
        }
        return count;

    }
}
