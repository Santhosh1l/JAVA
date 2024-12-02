import java.util.Scanner;
public class numberpattern {

        public static void main(String[] args) {
            int n = 5;
            printPattern(n);
        }

        public static void printPattern(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print((j + i) % n + 1);
                }
                System.out.println();
            }
        }
    }


