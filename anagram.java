import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1="fdshfhkjhf";
        String s2="hello";
        char [] c1= s1.toLowerCase().toCharArray();
        char [] c2= s2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2)){
            System.out.print("yes");
        }
        else
        System.out.println("no");
    }
}
