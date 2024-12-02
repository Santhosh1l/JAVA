import java.util.Scanner;

public class bubble {
    public static int bubblesortswaps(int[] arr, int n, boolean des) {
        int swaps = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((des && arr[j] > arr[j + 1]) || (!des && arr[j] < arr[j + 1])) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        return swaps;
    }

    public static int findminimumswaps(int[] arr) {
        int n = arr.length;
        int[] arrasc = arr.clone();
        int[] arrdesc = arr.clone();
        int swapsasc = bubblesortswaps(arrasc, n, true);
        int swapsdesc = bubblesortswaps(arrdesc, n, false);
        return Math.min(swapsasc, swapsdesc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findminimumswaps(arr));
    }
}
