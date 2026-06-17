import java.util.Scanner;

public class value_after_operation_2011 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] operations = new String[n];

        for (int i = 0; i < n; i++) {
            operations[i] = sc.nextLine();
        }

        int x = 0;

        for (String s : operations) {
            if (s.equals("++X") || s.equals("X++")) {
                x += 1;
            } else {
                x -= 1;
            }
        }

        System.out.println(x);

        sc.close();
    }
}