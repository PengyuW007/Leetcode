package Easy;

public class Calculate_LCP17 {
    public static void main(String[] args) {
        System.out.println(calculate2("AB"));
    }

    public static int calculate1(String s) {
        int x = 1, y = 0;

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (curr == 'A') {
                x = 2 * x + y;
            } else {
                y = 2 * y + x;
            }
        }

        return x + y;
    }

    public static int calculate2(String s){
        return (int) Math.pow(2,s.length());
    }
}
