import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = n.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = n.nextInt();
        }

        System.out.println("Enter the element you want to delete:");
        int dele_ele = n.nextInt();

        int[] newarr = new int[size - 1];
        int j = 0;
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] != dele_ele) {
                if (j < newarr.length) {
                    newarr[j++] = arr[i];
                }
            } else {
                found = true;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        } else {
            arr = newarr;
            size--;

            System.out.println("Array after the deletion of the element:");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
