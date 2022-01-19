package Easy;

public class MostWordsFound_2114 {
    public static void main(String[] args) {
        String[]sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int res = 0;

        for (int i = 0; i < sentences.length; i++) {
            //String sentence = sentences[i];
            String tokens[] = sentences[i].split(" ");
            res = Math.max(res, tokens.length);
        }

        return res;
    }
}
