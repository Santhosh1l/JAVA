import java.util.Arrays;

public class SORT_ALPHABET {









    // Function to sort a string of letters in lexicographical order
    public static String countSort(String arr) {
        // Array to keep count of the occurrence of each character ('a' to 'z')
        int[] count = new int[26];

        // Count the frequency of each character
        for (int i = 0; i < arr.length(); i++) {
            count[arr.charAt(i) - 'A']++;
        }
        System.out.println(Arrays.toString(count));
        // Build the sorted string
        StringBuilder sortedString = new StringBuilder();

        // Traverse through the count array
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                // Append the character corresponding to 'a' + i
                sortedString.append((char) (i +'A'));
                count[i]--;  // Reduce the count after adding to the result
            }
        }

        // Return the sorted string
        return sortedString.toString();
    }

    // Main method to test the function
    public static void main(String[] args) {
        String arr = "HELLO";

        // Call countSort and print the sorted result
        String sortedString = countSort(arr);
        System.out.println("Sorted string: " + sortedString);
    }
}



