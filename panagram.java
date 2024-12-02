import java.util.*;
public class panagram {

    public static boolean isPangram(String str) {

        HashSet<Character> letters = new HashSet<>();

        // Convert the string to lowercase
        str = str.toLowerCase();

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                letters.add(c); // Add letter to the set
            }
        }
        System.out.println(letters);

        // Check if we have all 26 letters
        return letters.size() == 26;
    }

    public static void main(String[] args) {
        String test1 = "The quick brown fox jumps over the lazy dog";
        String test2 = "Hello, world!fox jumps over the lazy dog bcik";

        System.out.println("Is the first string a pangram? " + isPangram(test1));
        System.out.println("Is the second string a pangram? " + isPangram(test2));
    }
}
