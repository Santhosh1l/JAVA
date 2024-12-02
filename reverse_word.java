import java.util.Scanner;

public class reverse_word {

         public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a sentence:");
            String s1 = scanner.nextLine();

            char[] s = s1.toCharArray(); // Convert the string to a character array

            int i = 0;
            int j = s.length - 1;
            while (i < j) {
                char temp = s[i]; // Corrected to use char type
                s[i] = s[j];
                s[j] = temp;
                i++;
                j--;
            }System.out.println(String.valueOf(s));
        }}