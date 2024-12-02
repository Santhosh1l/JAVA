import java.util.Arrays;

public class ascending {
    public static void main(String[] args) {
        int[] a = new int[]{8, 2, 9, 33, 87};
        int temp = 0;
    // Arrays.sort(a);
        // Bubble sort algorithm
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}