import java.util.Arrays;
public class unique_2 {
    public static void main(String[] args) {
        int []arr= {2, 3, 4, 3, 2};
        int [] temp= new int[arr.length];
        int j=0;
        int k=1;
        boolean isduplicate=false;
        for(int i=0;i<arr.length;i++){
            for( k=0;k<j;k++){
                if(arr[k]==arr[i]){
                    isduplicate=true;
                    break;
                }
            }if(k==j){
                isduplicate=false;
                temp[j++]=arr[i];
            }

            }
        int sum=0;
        int dup[]=Arrays.copyOf(temp,j);
        for(int i=0;i<dup.length;i++){
            System.out.println(dup[i]);
            sum+=arr[i];
        }
        System.out.println(sum);


    }
}
