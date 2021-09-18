package Easy;

public class CanWinNim_292 {
    public static void main(String[] args) {
        System.out.println(canWinNim(2));
    }

    public static boolean canWinNim(int n) {
        boolean res = false;

        if(n%4!=0){
            res = true;
        }

        return res;
    }
}
