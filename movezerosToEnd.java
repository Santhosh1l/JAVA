import java.util.Arrays;
import java.util.Scanner;

public class movezerosToEnd {
    public static void main(String[] args) {
        int []a={1,2,0,0,4};
        int j=0;
        int i=0;
        int n=a.length;

        while(i<n){
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;

            }i++;


        }

        int b=Math.min(4+6,6-7);
        System.out.println(b);

        String s="HEllo";
        s=s.toLowerCase();
        System.out.println(Arrays.toString(a));
}}
