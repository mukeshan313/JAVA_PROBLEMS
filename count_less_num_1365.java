public class count_less_num_1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int index = 0;
        int arr[] = new int[nums.length];

        while (index < nums.length) {
            count = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[index] > nums[i]) {
                    count++;
                }
            }

            arr[index] = count;
            index++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};

        int[] result = smallerNumbersThanCurrent(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}