import java.util.*;
public class longestSubArrayWithSUm {


    public static void main(String[] args) {
        int arr[]={10, 5, 2, 7, 1, 9};
        int sum=15;
        int n= arr.length;

        System.out.println( longest(arr,sum,n));


    }
     static int longest(int arr[], int sum, int n){

        int arrar=0;
        int start=0;
        int end=0;
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                s+=arr[j];

            if(s==sum){

                if(j-i+1>arrar){
                    arrar=j-i+1;
                    start=i;
                    end=j;

                }
            }
            }
        }
            ArrayList<Integer> ls=new ArrayList<>();
            if(start!=-1){
                for(int i=start;i<=end;i++){
                    ls.add(arr[i]);
                }
                // need to print the subarray use below code

               // System.out.println(ls);
            }
         //System.out.println(ls.size());

return ls.size();

      //  return -1;
     }
}
