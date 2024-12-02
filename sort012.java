import java.util.*;

public class sort012 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 2, 1, 2, 0));
        int count0 = 0;
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==0){
                count0++;
            }
            if(arr.get(i)==1){
                count1++;
            }
            if(arr.get(i)==2){
                count2++;
            }
        }
        for(int i=0;i<count0;i++){
            arr.set(i,0);
        }
        for(int i=count0;i<count0+count1;i++){
            arr.set(i,1);
        }
        for(int i= count0+count1;i<count0+count1+count2;i++){
            arr.set(i,2);
        }
        System.out.println(arr);

    }
}
