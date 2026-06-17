import java.util.Arrays;

public class LEFT_sum_dif_Rigth_SUM {
    public static void main(String[] args) {
        int[] nums = {10, 4, 8, 3};

        int n = nums.length;

        int[] leftsum = new int[n];
        int[] rightsum = new int[n];
        int[] res = new int[n];

        for (int i = 1; i < n; i++) {
            leftsum[i] = leftsum[i - 1] + nums[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            rightsum[i] = rightsum[i + 1] + nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            res[i] = Math.abs(leftsum[i] - rightsum[i]);
        }

        System.out.println(Arrays.toString(res));
    }
}