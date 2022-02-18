package Easy;

public class $SortSentence_1859 {
    public static void main(String[] args) {
        String s = "Myself2 Me1 I4 and3";

        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String inTokens[] = s.split(" ");
        String tokens[] = new String[inTokens.length];

        for (int i = 0; i < inTokens.length; i++) {
            int index = inTokens[i].charAt(inTokens[i].length() - 1) - 48-1;
            tokens[index]=inTokens[i].substring(0,inTokens[i].length()-1);
        }
        String res = "";

        for(int i = 0;i< tokens.length-1;i++){
            res+=tokens[i]+" ";
        }
        res+=tokens[tokens.length-1];

        return res;
    }
}
