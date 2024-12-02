public class addstring {
    public static void main(String[] args) {
        int sum=0;
        String str= "1234";
        int number= Integer.parseInt(str);
        while(number!=0){
            sum+=number%10;
            number/=10;
        }
        System.out.println(sum);
    }
}
