import java.util.*;
public class FirstElementUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = "hello world";
        StringBuilder caps = new StringBuilder();
        boolean newword = true;
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            System.out.println(ch);
            if (ch == ' ') {
                newword = true;
                caps.append(ch);

            } else {
                if (newword) {
                    if(ch>='a'&& ch<='z'){
                        ch= (char) (ch-32);
                    }newword=false;
                }caps.append(ch);
            }
        }
        System.out.println(String.valueOf(caps));
    }}
