package Easy;

public class IsSameAfterReversals_2119 {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals1(1800));
        System.out.println(isSameAfterReversals2(526));
    }

    public static boolean isSameAfterReversals1(int num){
        return num%10!=0||num==0;
    }

    public static boolean isSameAfterReversals2(int num) {
        boolean res = true;
        String numStr = num + "";
        char[] chars1 = numStr.toCharArray();

        char[] chars2 = reverse(chars1);

        if(chars2[0]=='0'&&chars1.length!=1){
            res = false;
        }

        return res;
    }

    private static char[] reverse(char[] ori) {
        int len = ori.length;
        char[] res = new char[len];

        for (int i = 0; i < len; i++) {
            res[len - 1 - i] = ori[i];
        }

        return res;
    }
}
