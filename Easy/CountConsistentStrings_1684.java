package Easy;

import java.util.*;

public class CountConsistentStrings_1684 {
    public static void main(String[] args) {
        String[] words = {"a", "b", "c", "ab", "ac", "bc", "abc"};

        System.out.println(countConsistentStrings("abc", words));
    }

    public static int countConsistentStrings(String str, String[] words) {
        Set<Character> set = new HashSet();
        for (char ch : str.toCharArray()) set.add(ch);

        int cnt = 0;
        for (String w : words) {
            for (char ch : w.toCharArray()) {
                if (!set.contains(ch)) {
                    ++cnt;
                    break;
                }
            }
        }
        return words.length - cnt;
    }
}
