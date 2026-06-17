import java.util.Scanner;

public class reverse {
    public static int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            // Underflow check
            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = sc.nextInt();

        System.out.println("Reversed Integer: " + reverse(x));

        sc.close();
    }
}