package Easy;

public class ReplaceDigits_1844 {
    public static void main(String[] args) {
        String s = "a1c1e1";

        System.out.println(replaceDigits(s));
    }

    public static String replaceDigits(String s) {
        int n = s.length();
        char[]chars = s.toCharArray();

        for (int i = 1; i < n; i += 2){
            //i = number, i-1 = char
            chars[i] = (char) (chars[i]-'0'+chars[i-1]);
        }

        return new String(chars);
    }
}
