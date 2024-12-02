import java.util.*;

public class missing_no{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /* System.out.println("Enter the size of the array");
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n; i++){
            arr[i]=sc.nextInt();
        }*/

        //int arr[] = {10, 12, 11, 15, 13, 18, 20}; // Example array with multiple missing numbers
   System.out.println("Enter the size of the array");
   int n= sc.nextInt();
   int[] arr= new int[n];
   System.out.println("Enter the element");
   for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
   }
ArrayList<Integer> missing= new ArrayList<>();
        Arrays.sort(arr);

        System.out.println("Missing numbers are:");
        for (int i = 0; i < n - 1; i++) {
            int current = arr[i];
            int next = arr[i + 1];
if(current==next){
    continue;
}
            // Check if there is a gap between consecutive numbers
            if (next - current > 1) {
                for (int j = current + 1; j < next; j++) {
                    System.out.print(j + " ");
                    missing.add(j);
                }
            }
        }
        System.out.println();
        System.out.println(missing);
        }
    }
