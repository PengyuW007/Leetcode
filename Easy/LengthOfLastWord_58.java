package Easy;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        String s = "Hello World";

        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        char curr = s.charAt(index);
        while ( curr== ' ') {
            curr = s.charAt(index);
            index--;
        }
        int wordLength = 0;

        while ( s.charAt(index) != ' ') {
            curr = s.charAt(index);
            wordLength++;
            index--;

        }
        return wordLength;
    }
}
