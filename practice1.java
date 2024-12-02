import java.sql.SQLOutput;
import java.util.*;

public class practice1 {

    public static void main(String[] args) {
       String s1="Mertl                                ";
       String s2="mer cer met             ti";
       int count1=0;
       int count2=0;

       for(int i=0;i<s1.length();i++){
           if(Character.isWhitespace(s1.charAt(i))){
               count1++;
           }
       }
       for(int j=0;j<s2.length();j++){
           if(Character.isWhitespace(s2.charAt(j))){
               count2++;
           }
       }
        System.out.println(count2);
        System.out.println(count1);
       int n=count1-count2;
       if((count1-count2)%2==0){
           System.out.println("even"+n);
       }
       else{
           System.out.println("odd"+n);
       }
    }
}
