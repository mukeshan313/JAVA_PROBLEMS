public class last_len {

    public static int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");
        return arr[arr.length - 1].length();
    }

    public static void main(String[] args) {
        String s = "Hello World";

        int result = lengthOfLastWord(s);

        System.out.println("Length of last word: " + result);
    }
}