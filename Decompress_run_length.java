import java.util.Arrays;
import java.util.Scanner;

public class Decompress_run_length {

    public static int[] decompressRLElist(int[] nums) {

        int size = 0;

        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int arr[] = new int[size];
        int index = 0;

        for (int j = 0; j < nums.length; j += 2) {
            int fre = nums[j];
            int val = nums[j + 1];

            for (int i = 0; i < fre; i++) {
                arr[index] = val;
                index++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result[] = decompressRLElist(nums);

        System.out.println("Decompressed Array:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}