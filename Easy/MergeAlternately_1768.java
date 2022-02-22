package Easy;

public class MergeAlternately_1768 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab","pqrs"));
    }

    public static String mergeAlternately(String word1, String word2) {
        String word = "";
        int len1 = word1.length();
        int len2 = word2.length();
        int min = Math.min(len1, len2);

        if(min==len1){
            for (int i = 0; i < min; i++) {
                word+=word1.charAt(i);
                word+=word2.charAt(i);
            }
            word+=word2.substring(min,len2);
        }else{
            for (int i = 0; i < min; i++) {
                word+=word1.charAt(i);
                word+=word2.charAt(i);
            }
            word+=word1.substring(min,len1);
        }

        return word;
    }
}
