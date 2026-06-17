import java.util.Scanner;

public class max_min {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Runtime input for array
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Operations
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {

            sum += arr[i];

            if(arr[i] > max) {
                max = arr[i];
            }

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        double average = (double) sum / n;

        // Output
        System.out.println("Sum = " + sum);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Average = " + average);
    }
}
