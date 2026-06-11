public class last_stone_weight_1046 {

    public static int lastStoneWeight(int[] stones) {

        int size = stones.length;

        while (size > 1) {

            int largestnum = -1;
            int secondlargestnum = -1;
            int largestIndex = -1;
            int secondlargestIndex = -1;

            for (int i = 0; i < size; i++) {

                if (stones[i] > largestnum) {
                    secondlargestnum = largestnum;
                    secondlargestIndex = largestIndex;

                    largestnum = stones[i];
                    largestIndex = i;
                } 
                else if (stones[i] > secondlargestnum && i != largestIndex) {
                    secondlargestnum = stones[i];
                    secondlargestIndex = i;
                }
            }

            if (largestnum == secondlargestnum) {
                stones[largestIndex] = 0;
                stones[secondlargestIndex] = 0;
            } else {
                stones[largestIndex] = largestnum - secondlargestnum;
                stones[secondlargestIndex] = 0;
            }

            int k = 0;
            for (int i = 0; i < size; i++) {
                if (stones[i] != 0) {
                    stones[k] = stones[i];
                    k++;
                }
            }

            size = k;
        }

        if (size == 0) {
            return 0;
        }

        return stones[0];
    }

    public static void main(String[] args) {

        int[] stones = {4, 8, 3, 8, 3, 10, 7};

        int result = lastStoneWeight(stones);

        System.out.println("Last Stone Weight = " + result);
    }
}