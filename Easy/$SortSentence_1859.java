package Easy;

public class $SortSentence_1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";

        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String inTokens[] = s.split(" ");
        String tokens[] = new String[inTokens.length];

        for (int i = 0; i < inTokens.length; i++) {
            int index = inTokens[i].charAt(inTokens[i].length() - 1) - 48-1;
            tokens[index]=inTokens[i].substring(0,inTokens.length-2);
        }
        String res = "";
        for(int i = 0;i< tokens.length;i++){
            res+=tokens[i]+ " ";
        }

        return res;
    }
}
