import java.util.ArrayList;
import java.util.Collections;

public class factor {

    public static void main(String[] args) {
        int n =6;
        ArrayList<Integer> sum= new ArrayList<Integer>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sum.add(i);
                System.out.print(i+" ");


            }
            if(n/i!=i){
                sum.add(n/i);
                System.out.print(n/i+" ");

            }
        }
        Collections.sort(sum);
        System.out.println("\n"+sum);



    }}
