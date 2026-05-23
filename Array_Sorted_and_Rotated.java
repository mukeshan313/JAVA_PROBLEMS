import java.util.*;

public class Array_Sorted_and_Rotated {

    public static boolean check(int[] nums) {

        int count = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }

        return count <= 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nums[] = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean ans = check(nums);

        System.out.println(ans);
    }
}