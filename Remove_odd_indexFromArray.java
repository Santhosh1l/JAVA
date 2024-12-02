import java.util.Arrays;

public class Remove_odd_indexFromArray {


    public static void main(String[] args) {
        String str="goeks";
        int n= str.length();
        char []ch= str.toCharArray();
        int j=0;
        char []del=new char[n];
        System.out.println(Arrays.toString(ch));
        for(int i=0;i<ch.length;i++){
            if(i%2!=0){
                continue;

            }else {
                del[j++]=ch[i];

            }

        }
        char [] demp=Arrays.copyOf(del,j);

        System.out.println(String.valueOf(demp));
    }
}