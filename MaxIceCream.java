public class MaxIceCream {
    public static int maxIceCream(int[] costs, int coins) {
        java.util.Arrays.sort(costs);

        int count = 0;

        for (int i = 0; i < costs.length; i++) {
            if (coins >= costs[i]) {
                coins -= costs[i];
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] costs = {1, 3, 2, 4, 1};
        int coins = 7;

        System.out.println(maxIceCream(costs, coins));
    }
}
