package Easy;

public class SquareIsWhite_1812 {
    public static void main(String[] args) {
        System.out.println(squareIsWhite("a1"));
    }

    public static boolean squareIsWhite(String coordinates) {
       return ((coordinates.charAt(0) - 'a' + 1) + (coordinates.charAt(1) - '0')) % 2 == 1;
    }
}
