import java.util.ArrayList;
import java.util.Arrays;

public class remove_duplicates {


        public static int removeDuplicates(int[] arr) {
            if (arr == null || arr.length == 0) {
                return 0;
            }

            Arrays.sort(arr); // Sort the array to group duplicates together
            int index = 0; // Pointer for unique numbers

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[index]) { // If the current number is different from the last unique
                    index++;
                    arr[index] = arr[i]; // Move the unique number to the next position
                }
            }

            return index + 1; // Length of the array with unique elements
        }

        public static void main(String[] args) {
            int[] arr = {3, 1, 2, 3, 1, 4, 2, 5, 3, 1};
            int newSize = removeDuplicates(arr);

            System.out.println("Array after removing duplicates:");
            for (int i = 0; i < newSize; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\nNew size: " + newSize);
        }
    }
