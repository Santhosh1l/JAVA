import java.util.ArrayList;
import java.util.Arrays;

public class remove_duplicates {
    public static void main(String[] args) {
        int[] array = { 2, 3, 4, 5, 5, 4};
        int n= array.length;
        int[] temp=new int[n];
        int j=0;

        boolean isduplicate=true;
        for(int i=0;i<array.length;i++){
int k;

            for( k=0;k<j;k++){
                if(array[i]==temp[k]){

                    isduplicate=false;
                    break;

                }
            }if(isduplicate){
                temp[j++]=array[i];

            }

        }
        int[] duplic= Arrays.copyOf(temp,j);
        //System.out.println(duplic);
        ArrayList<Integer> d=new ArrayList<>();
        for(int i:duplic){
            d.add(i);

        }
        System.out.println(d);
        System.out.println("Array with duplicates removed: " + Arrays.toString(duplic));




    }}