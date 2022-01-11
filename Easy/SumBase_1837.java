package Easy;

public class SumBase_1837 {
    public static void main(String[] args) {
        System.out.println(sumBase(34,6));
    }

    public static int sumBase(int n, int k) {
        int res = 0;

        while(n!=0){
            res+=n%k;
            n/=k;
        }

        return res;
    }
}
