package Easy;

import java.util.ArrayList;

public class FreqAlphabets_1309 {
    public static void main(String[] args) {

    }

    public static String freqAlphabets(String s) {
        String res = "";
        ArrayList<Integer>arr = new ArrayList<>();

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                arr.add(i);
            }
        }

        for(int i = 0;i<arr.size();i++){
            
        }

        return res;
    }
}
