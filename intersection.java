import java.util.*;

public class intersection {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,56,7899, 997};
        int arr2[] = {2,3,55,66,77,997,997};;

       // HashSet<Integer> Inter = new HashSet<>();
ArrayList<Integer> Inter=new ArrayList<>();
        TreeSet<Integer> l = new TreeSet<Integer>();

        // Adding all elements of arr1 to the TreeSet
        for (int i : arr1) {
            l.add(i);
        }

        // Checking for elements in arr2 that are present in arr1
        for (int i : arr2) {
            if (l.contains(i)) {
              //  l.remove(i);
                Inter.add(i);
                // If exists, add to intersection list
            }
        }

        // If intersection list is empty, add -1
        if (Inter.isEmpty()) {
            Inter.add(-1);
        }

        // Print the result

        System.out.println(Inter);}
}
