public class min_dis_target {

    public static int getMinDistance(int[] nums, int target, int start) {

        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                minDistance = Math.min(minDistance,Math.abs(i - start));
            }
        }

        return minDistance;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 3};
        int target = 3;
        int start = 5;

        System.out.println(getMinDistance(nums, target, start));
    }
}
