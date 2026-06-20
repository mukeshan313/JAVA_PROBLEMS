public class kth_string_2053 {

    public static String kthDistinct(String[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }

            if (count == 1) {
                k--;

                if (k == 0) {
                    return arr[i];
                }
            }
        }

        return "";
    }

    public static void main(String[] args) {
        String[] arr = {"d", "b", "c", "b", "c", "a"};
        int k = 2;

        System.out.println(kthDistinct(arr, k));
    }
}