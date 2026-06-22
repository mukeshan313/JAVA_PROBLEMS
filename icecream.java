public class icecream {
    public static void main(String[] args) {

        String text = "loonbalxballpoon";

        int[] freq = new int[26];

        for (char ch : text.toCharArray()) {
            freq[ch - 'a']++;
        }

        int ans = freq['b' - 'a'];

        if (freq['a' - 'a'] < ans)
            ans = freq['a' - 'a'];

        if (freq['l' - 'a'] / 2 < ans)
            ans = freq['l' - 'a'] / 2;

        if (freq['o' - 'a'] / 2 < ans)
            ans = freq['o' - 'a'] / 2;

        if (freq['n' - 'a'] < ans)
            ans = freq['n' - 'a'];

        System.out.println(ans);
    }
}