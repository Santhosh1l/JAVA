import java.util.*;
public class FirstRepeatingElement {
    public static void main(String[] args) {
        int [] arr={7 ,4 ,0 ,9 ,4 ,8 ,8 ,2 ,4 ,5 ,5 ,1};
        int n=arr.length;
      //  firstel(arr,n);
        System.out.println(firstel(arr,n));

    }

    static int firstel(int arr[], int n){
        HashSet<Integer> seen = new HashSet<>();
        HashMap<Integer, Integer>ele= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            //int num= arr[i];
            if(seen.contains(arr[i])){
                return ele.get(arr[i]);
            }
            seen.add(arr[i]);
            ele.put(arr[i],i);

        }
        return -1;
    }
}
