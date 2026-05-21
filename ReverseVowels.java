public class ReverseVowels {

    public static void main(String[] args) {

        Solution obj = new Solution();

        String s = "hello";

        String result = obj.reverseVowels(s);

        System.out.println(result);
    }
}

class Solution {

    public String reverseVowels(String s) {

        char arr[] = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !isvowels(arr[left])) {
                left++;
            }

            while (left < right && !isvowels(arr[right])) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public boolean isvowels(char ch) {

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }

        return false;
    }
}