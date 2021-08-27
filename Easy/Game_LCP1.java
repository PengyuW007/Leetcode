package Easy;

public class Game_LCP1 {
    public static void main(String[] args) {
        int guess []= {2,2,3};
        int answer[] = {3,2,1};
        System.out.println(game(guess,answer));
    }

    public static int game(int[] guess, int[] answer) {
        int res = 0;
        for(int i = 0;i<guess.length;i++){
            if(guess[i]==answer[i]){
                res++;
            }
        }
        return res;
    }
}
