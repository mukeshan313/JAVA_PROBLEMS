import java.util.*;

public class min_cost_buy_candies {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int total = 0;
        int count=0;
        for (int i = cost.length - 1; i >= 0; i--) {
            count++;
            if(count%3!=0){
                total+=cost[i];
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int cost[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        min_cost_buy_candies obj = new min_cost_buy_candies();
        int ans = obj.minimumCost(cost);

        System.out.println("Minimum cost to buy candies: " + ans);

        sc.close();
    }
}