import java.util.Scanner;
import java.util.*;
public class reverse_string {
    public static void main(String[] args) {
    String str="Hello world";
    String str1[]=str.split(" ");
    //System.out.println(Arrays.toString(str1));
    for(int i= str1.length-1;i>=0;i--){
        System.out.print(str1[i]);
        if(i>0){
            System.out.print(" ");
        }

        }
    }
}
