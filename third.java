import java.util.*;
public class third {
   // import java.util.*;


        public static void main(String[] args) {
            int arr[] = {1,4,45,6,10,8};
            int sum = 13;
            threesum(arr, sum);
        }

        static void threesum(int[] arr, int target) {
            int n = arr.length;
            Arrays.sort(arr); // Sort the array

            // Iterate through the array
            for (int i = 0; i < n - 2; i++) {
                int l = i + 1;
                int r = n - 1;

                // Two-pointer approach
                while (l < r) {
                    int current = arr[i] + arr[l] + arr[r];

                    if (current == target) {
                        System.out.println("Triplet found: " + arr[i] + " "+ arr[l]+" " + arr[r]);
                        //return;
                        break;}
                    else if (current < target) {
                        l++;
                    }
                    else {
                        r--;
                    }
                    if(current!=target){

                    }
                }
            }

           //
        }
    }
