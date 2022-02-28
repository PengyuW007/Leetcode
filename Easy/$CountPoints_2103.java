package Easy;

public class $CountPoints_2103 {
    public static void main(String[] args) {
        System.out.println(countPoints("R3G2B1"));
    }

    public static int countPoints(String rings) {


        int res = 0;
        rings = rings.toLowerCase();

        //System.out.println('0'-48);
        for(int i =1;i<rings.length();i+=2){
            char color = rings.charAt(i-1);
            char index = rings.charAt(i);
            int location = index-48;
            if(color=='R'){
                //red

            }
        }

        return res;
    }
}
