package Easy;

import java.util.*;

public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        String strs[] = {"flower", "flow", "flight"};

        String res = longestCommonPrefix(strs);

        System.out.println(res);
    }

    public static String longestCommonPrefix(String[] strs) {
        ArrayList<Character> st = new ArrayList<>();
        String strCurr;
        int len = strs.length, stSize, compSize;
        // Boolean res = true;


        for (int i = 0; i < strs[0].length(); i++) {
            st.add(strs[0].charAt(i));
        }//add all the items to stack

        for (int i = 1; i < len; i++) {
            strCurr = strs[i];
            stSize = st.size();

            compSize = Math.min(strCurr.length(), stSize);

            for (int j = 0; j < compSize; j++) {
               // System.out.println(strCurr.charAt(j)+" "+st.get(j));
                //System.out.println();

                if(strCurr.charAt(j)!=st.get(j)){
                    st.remove(st.size()-1);
                }

                if (st.size() == 0)
                    break;
            }
        }

        return String.valueOf(st);
    }
}
