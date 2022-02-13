package Easy;

public class IsSumEqual_1880 {
    public static void main(String[] args) {
        System.out.println(isSumEqual("acb", "cba", "cdb"));
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return stringToInt(firstWord) + stringToInt(secondWord) == stringToInt(targetWord);
    }

    private static int stringToInt(String word) {
        int res = 0;
        int len = word.length();

        for (int i = 0; i < len; i++) {
            int curr = (int) word.charAt(i) - 'a';
            res += curr * Math.pow(10, len - 1 - i);
        }

        return res;
    }
}
