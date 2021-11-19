package Mid;

public class IntegerReplacement_397 {
    public static void main(String[] args) {
        System.out.println(integerReplacement(4));
    }

    public static int integerReplacement(int n) {
        int res = 0;
        while(n>1){
            if(n%2==0){
                n/=2;
            }else{
                n--;
            }
            res++;
        }

        return res;
    }
}
