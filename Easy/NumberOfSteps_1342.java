package Easy;

public class NumberOfSteps_1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }

    public static int numberOfSteps(int num) {
        int res;
        int steps = 0;

        while(num>0){
            res = num%2;
            if(res==0){
                num = num/2;
            }else{
                num--;
            }
            steps++;
        }

        return steps;
    }
}
