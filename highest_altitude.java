class highest_altitude {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int trip[] = new int[n + 1];

        trip[0] = 0;

        for (int i = 1; i <= n; i++) {
            trip[i] = trip[i - 1] + gain[i - 1];
        }

        System.out.print("Trip Altitudes: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(trip[i] + " ");
        }
        System.out.println();

        int max = trip[0];

        for (int i = 1; i <= n; i++) {
            max = Math.max(max, trip[i]);
        }

        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] gain = {-5, 1, 5, 0, -7};

        int result = sol.largestAltitude(gain);

        System.out.println("Highest Altitude: " + result);
    }
}