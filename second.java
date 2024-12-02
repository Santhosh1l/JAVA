import java.util.*;

public class second {
    public static void main(String[] args) {
        int arr[] = {100, 20, 70, 80, 75, 22,};
        Arrays.sort(arr);
        int n = arr.length;
        int lar = arr[n - 1];
        int se = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > se) {
                se = arr[i];

                break;
            }
        }
        System.out.println(Arrays.toString(arr
        ));
        System.out.println(se);

    }}
