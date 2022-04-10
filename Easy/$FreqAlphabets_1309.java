package Easy;

import java.util.ArrayList;

public class $FreqAlphabets_1309 {
    public static void main(String[] args) {
        freqAlphabets("hi");
    }

    public static String freqAlphabets(String s) {
        String res = "";
        ArrayList<Integer>arr = new ArrayList<>();

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                arr.add(i);
            }
        }
        int acc  =0;
        int i = 10;
        for (i =10; i>0; i--) {
            acc+=2;
        }
        System.out.println(acc+" "+i);



        return res;
    }
}
