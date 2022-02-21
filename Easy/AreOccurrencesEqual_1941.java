package Easy;

public class AreOccurrencesEqual_1941 {
    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("zpfupfkmsuistzmtkijj"));
    }

    public static boolean areOccurrencesEqual(String s) {
        boolean res = true;
        int[] dictionary = new int[26];
        for (int i = 0; i < s.length(); i++) {
            dictionary[s.charAt(i) - 'a']++;
        }

        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (dictionary[i] > 0) {
                if (cnt == 0) cnt = dictionary[i];
                else if (cnt != dictionary[i]) res = false;
            }
        }

        return res;
    }
}
