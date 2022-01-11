package Easy;

public class RomanToInt_13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));;
    }

    public static int romanToInt(String s) {
        int len = s.length();
        char right = s.charAt(len-1);
        char left;
        int res = getChar(right);

        for(int i = len-2;i>=0;i--){
            left = s.charAt(i);
            right = s.charAt(i+1);

            if(getChar(right)>getChar(left)){
                //minus,IV
                res-=getChar(left);
            }else{
                res+=getChar(left);
            }
        }

        return res;
    }

    public static int getChar(char c){
        int res = 0;

        if(c=='I')
            res = 1;
        else if(c=='V')
            res = 5;
        else if(c=='X')
            res = 10;
        else if(c=='L')
            res = 50;
        else if(c=='C')
            res = 100;
        else if(c=='D')
            res = 500;
        else if(c=='M')
            res = 1000;

        return res;
    }
}
