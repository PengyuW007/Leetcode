package Easy;

public class ArrayStringsAreEqual_1662 {
    public static void main(String[] args) {
        String word1[] ={"ab", "c"};
        String word2[]={"a", "bc"};

        System.out.println(arrayStringsAreEqual(word1,word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean res = false;
        String w1 = "",w2="";

        for(int i = 0;i< word1.length;i++){
            w1+=word1[i];
        }

        for(int i = 0;i< word2.length;i++){
            w2+=word2[i];
        }

        if(w1.equals(w2))
            res = true;

        return res;
    }
}
