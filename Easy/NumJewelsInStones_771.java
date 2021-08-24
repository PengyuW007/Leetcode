package Easy;

public class NumJewelsInStones_771 {
    public static void main(String[] args) {
        String jewels = "aA",stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int res = 0;

        for(int i = 0;i<jewels.length();i++){
            for(int j = 0;j<stones.length();j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    res++;
                }
            }
        }

        return res;
    }
}
