import java.util.Scanner;

class sum_of_compatible {

    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= n + k; i++) {

          
            if (Math.abs(n - i) <= k && ( (n & i) == 0 )) {
                count++;
                sum += i;

                if (count == k) {
                    return sum;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        sum_of_compatible obj = new sum_of_compatible();
        int result = obj.sumOfGoodIntegers(n, k);

        System.out.println("Sum of good integers: " + result);

        sc.close();
    }
}