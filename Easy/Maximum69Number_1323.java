package Easy;

public class Maximum69Number_1323 {
    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
    }

    public static int maximum69Number (int num) {
        String numStr = num+"";
        for(int i =0;i<numStr.length();i++){
            if(numStr.charAt(i)=='6'){
                numStr=numStr.substring(0,i)+'9'+numStr.substring(i+1);
                //numStr =numStr.replace('6','9');
                break;
            }
        }
        num = Integer.parseInt(numStr);
        return num;
    }
}
