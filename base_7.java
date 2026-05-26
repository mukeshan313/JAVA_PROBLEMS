import java.util.Scanner;
public class base_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        System.out.println("Base 7 representation: " + convertToBase7(num));
    }

    public static String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean isNegative = num < 0;
        String ans="";
       
        num = Math.abs(num);

        while (num > 0) {
            int remainder = num % 7;
            ans = remainder + ans;
            num /= 7;
        }
        if (isNegative) {
            ans = "-" + ans;
        }
        return ans;


       
    }
}
