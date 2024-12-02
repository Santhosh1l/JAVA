public class numtostring {
    public static void main(String[] args) {


    int n = 123456;
    int sum=0;
    String s= Integer.toString(n);
        for(int i=0;i<s.length();i++){
        if(i%2==1)
            sum+=Character.getNumericValue(s.charAt(i));
    }


        System.out.println(sum);    }}
