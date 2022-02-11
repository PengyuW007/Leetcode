package Easy;

import java.util.*;

public class HalvesAreAlike_1704 {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike1("AbCdEfGh"));
    }

    public static boolean halvesAreAlike1(String s){
        s=s.toLowerCase();
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int pre = 0,post = 0;
        for(int i = 0;i<s.length()/2;i++){
            char front = s.charAt(i);
            char back =s.charAt(s.length()/2+i);
            if(set.contains(front)){
                pre++;
            }
            if(set.contains(back)){
                post++;
            }
        }
        return pre==post;
    }

    public static boolean halvesAreAlike2(String s) {
        s=s.toLowerCase();
        int pre = 0,post = 0;
        for(int i = 0;i<s.length()/2;i++){
            char front = s.charAt(i);
            char back =s.charAt(s.length()/2+i);
            if(front=='a'||front=='e'||front=='i'||front=='o'||front=='u'){
                pre++;
            }
            if(back=='a'||back=='e'||back=='i'||back=='o'||back=='u'){
                post++;
            }
        }
       return pre==post;
    }
}
