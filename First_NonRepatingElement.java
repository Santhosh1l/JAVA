import java.util.HashMap;

public class First_NonRepatingElement {
    public static void main(String[] args) {
        int arr[]={4,8,8,7,3,9
        };
        int n= arr.length;
        System.out.println(nonrepeat(arr,n));
        String s= "lloho";
       System.out.print( nonrepeat1(s));

    }
    static int nonrepeat(int arr[],int n){
       int non=-1;
       HashMap<Integer,Integer>fe= new HashMap<>();
       for(int i:arr){
           fe.put(i,fe.getOrDefault(i,0)+1);
       }
       for(int i:arr){
           if(fe.get(i)==1){
               non=i;
               break;
           }
       }


        return non;
    }
    static  String nonrepeat1(String s){
        char[] c= s.toCharArray();
        String s1="";
        HashMap<Character,Integer> fe= new HashMap<>();
        for(char d:c){
            fe.put(d,fe.getOrDefault(d,0)+1);
        }
        for(char i:c){
            if(fe.get(i)==1){
                s1+=i;
                break;
            }

        }


        return s1;
    }
}
