package Easy;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        String s = "Hello World";

        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        while (s.charAt(index) == ' ') {
            index--;
        }
        int wordLength = 0;
        while (index >= 0 && s.charAt(index) != ' ') {
            wordLength++;
            index--;

        }
        return wordLength;
    }
}
