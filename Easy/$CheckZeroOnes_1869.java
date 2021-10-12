package Easy;

public class $CheckZeroOnes_1869 {
    public static void main(String[] args) {
        System.out.println(checkZeroOnes("1101"));
    }

    public static boolean checkZeroOnes(String s) {
        boolean res=  false;
        int one = 0,zero = 0;

        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                if(s.charAt(i)=='1'){
                    one++;
                }else{
                    zero++;
                }
            }else{
                //one = 0;
                //zero = 0;
            }

        }

        System.out.println(one+" "+zero);

        if(one>zero){
            res = true;
        }

        return res;
    }
}
