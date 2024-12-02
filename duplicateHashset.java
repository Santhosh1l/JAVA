import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class duplicateHashset {
    public static void main(String[] args) {
        int arr[]={3, 1 ,0 ,4, 2 ,3 ,1
        };
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : arr) {
            if (!seen.add(num)) {  // If add() returns false, the element is a duplicate
                duplicates.add(num);
            }
            seen.add(num);
        }
        Arrays.toString(arr);

        System.out.println(seen);
        System.out.println(duplicates);
    }
}
