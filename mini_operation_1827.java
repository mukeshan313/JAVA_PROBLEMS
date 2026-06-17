public class mini_operation_1827 {
    public static int minOperations(int[] nums) {
        int operations = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int needed = nums[i - 1] + 1;
                operations += needed - nums[i];
                nums[i] = needed;
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 4, 1};

        System.out.println(minOperations(nums));
    }
}