public class reverse_string {
    public static void main(String[] args) {
        String str = "Hello world";
      String  ch[]=str.split(" ");
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        if(i>0){
            System.out.print(" ");
        }}

            }
        }