public class process_string_3612 {

    public static String processStr(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {
                result.append(ch);
            }
            else if (ch == '*') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            }
            else if (ch == '#') {
                result.append(result.toString());
            }
            else if (ch == '%') {
                result.reverse();
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "a#b%*";

        String ans = processStr(s);

        System.out.println(ans);
    }
}