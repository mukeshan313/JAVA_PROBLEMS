import java.util.*;

public class suffel_the_array {
    public static int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];

        int j = 0;
        for (int i = 0; i < n; i++) {
            arr[j++] = nums[i];
            arr[j++] = nums[i + n];
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int nums[] = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result[] = shuffle(nums, n);

        System.out.println("Shuffled Array:");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}