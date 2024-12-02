import java.util.*;
public class practice {
    public static void main(String[] args) {
        int arr[]={12,6,4,15,17,10};
        int n = arr.length;
        Arrays.sort(arr);
        int res = arr[n - 1] - arr[0];
        int k=6;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - k < 0)
                continue;


            int minH = Math.min(arr[0] + k, arr[i] - k);
            int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            System.out.println(arr[i-1]+k);
            
            res = Math.min(res, maxH - minH);
    }
        System.out.println(res);
}}