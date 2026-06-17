import java.util.Scanner;

class digit_frequency {

    public int digitFrequencyScore(int n) {
        int[] freq = new int[10]; 

        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }

        int score = 0;
        for (int i = 0; i < 10; i++) {
            score += i * freq[i];
        }

        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        digit_frequency obj = new digit_frequency();
        int result = obj.digitFrequencyScore(n);

        System.out.println("Digit Frequency Score: " + result);

        sc.close();
    }
}