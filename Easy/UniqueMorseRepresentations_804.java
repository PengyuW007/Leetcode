package Easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseRepresentations_804 {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        //String[] words = {"a"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> strings = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = 0; j < words[i].length(); j++) {
                char character = words[i].charAt(j);
                int index = (int) character - 'a';
                word += morse[index];
            }
            strings.add(word);
        }
        return strings.size();
    }
}