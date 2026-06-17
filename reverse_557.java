public class reverse_557 {

    public static String reverseWords(String s) {

        String[] words = s.split(" ");
        String result = "";

        for (String word : words) {

            String rev = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }

            result += rev + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";

        System.out.println(reverseWords(s));
    }
}