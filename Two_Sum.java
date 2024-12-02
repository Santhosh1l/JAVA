import java.util.*;
public class Two_Sum {
    public static void main(String args[]){
        int arr[]={1, 4, 45, 6, 10, 8};
        int target=16;
        twosum(arr,target);
    }

    public static void twosum(int arr[],int target){
        Arrays.sort(arr);
        int n= arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int sum= arr[i]+arr[j];
            if(sum==target){
                System.out.print(arr[i]+" " +arr[j]);
                return;
            } else if (sum<target) {
                i++;

            }
            else{
                j--;
            }


        }


    }
    }
