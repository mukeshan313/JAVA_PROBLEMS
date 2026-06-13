public class split_word {
    public static String truncateSentence(String s, int k) {
        String[] charr = s.split(" ");
        String result = "";

        for (int i = 0; i < k; i++) {
            result += charr[i];

            if (i != k - 1) {
                result += " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;

        System.out.println(truncateSentence(s, k));
    }
}