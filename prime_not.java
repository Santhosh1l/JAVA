import java.util.Scanner;

class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int num = sc.nextInt();
        if(getprime(num)){
            System.out.println(num  + "\tNUMBER IS Prime");
        }
        else{
            System.out.println(num +"\t NOT A PRIME");}
        for (int i = 2; i <= num; i++) {
            if (getprime(i)) {
                System.out.print(i + " ");
            }
        }

    }
    public static boolean getprime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                return false;
            }
        }
return true;    }
}