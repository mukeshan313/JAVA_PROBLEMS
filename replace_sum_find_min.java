import java.util.Scanner;

public class replace_sum_find_min {

    public static int minElement(int[] nums) {

        
        for(int i = 0; i < nums.length; i++) {

            int n = nums[i];
            int sum = 0;

            while(n > 0) {

                int digit = n % 10;
                sum += digit;
                n = n / 10;
            }

            nums[i] = sum;
        }

        // Find minimum
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] < min) {
                min = nums[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt();

        int nums[] = new int[n];

    
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = minElement(nums);

        System.out.println(ans);
    }
}