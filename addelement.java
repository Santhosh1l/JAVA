import java.util.ArrayList;
import java.util.Arrays;

public class addelement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 77, 99, 100};
        String s="hello";
       char c[]= s.toUpperCase().toCharArray();
        int index = 3;
        int value = 88;
        System.out.println(Arrays.toString(a));
        ArrayList<Integer> b = new ArrayList<Integer>();
        // int[]b= new int[a.length+1];
        for (int n : a) {
            b.add(n);
        }
        b.add(index, value
        );


        System.out.println(b);
    }
}
