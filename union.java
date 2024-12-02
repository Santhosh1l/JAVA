import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class union {
    public static void main(String[] args) {
        int arr1[] = {-7 ,8
        };
        int arr2[] = {-8 ,-3 ,8};

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        TreeSet<Integer> n= new TreeSet<Integer>();
        ArrayList<Integer> union= new ArrayList<Integer>();
        for(int i:arr1){
            n.add(i);
        }
        for(int i:arr2){
            n.add(i);
        }
      union.addAll(n);


        System.out.println(union);
    }
}
