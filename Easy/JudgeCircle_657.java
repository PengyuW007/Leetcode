package Easy;

public class JudgeCircle_657 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("LL"));
    }

    public static boolean judgeCircle(String moves) {
        boolean res = false;
        int len = moves.length();
        int x = 0, y = 0;

        for (int i = 0; i < len; i++) {
            char command =moves.charAt(i);
            if(command=='R'){
                x++;
            }else if(command=='L'){
                x--;
            }else if(command=='U'){
                y++;
            }else if(command=='D'){
                y--;
            }
        }

        if(x==0&&y==0){
            res = true;
        }

        return res;
    }
}
