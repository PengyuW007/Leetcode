package Easy;

public class FinalValueAfterOperations_2011 {
    public static void main(String[] args) {
        String[]operations = {"++X","++X","X++"};

        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int res = 0;

        for(int i = 0;i<operations.length;i++){
            String command = operations[i];

            if(command.equals("--X")||command.equals("X--")){
                --res;
            }else {
                res++;
            }
        }

        return res;
    }
}
