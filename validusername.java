import java.util.Scanner;

class UsernameValidator {
    // Regular expression to validate the username
    public static final String regularExpression = "^[A-Za-z][A-Za-z0-9_]{5,29}$";
}

public class validusername {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        scan.close();
    }
}
