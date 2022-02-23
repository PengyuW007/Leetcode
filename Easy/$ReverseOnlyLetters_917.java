package Easy;

public class $ReverseOnlyLetters_917 {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    public static String reverseOnlyLetters(String s) {
        String[]inTokens = s.split("-");
        String res ="";


        return res;
    }

    private static String[]reverse(String[]tokens){
        String arr[]=new String[tokens.length];

        for(int i = 0;i< tokens.length;i++){
            arr[i] = tokens[tokens.length-1-i];
        }
        return arr;
    }
}
