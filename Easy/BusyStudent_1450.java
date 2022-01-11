package Easy;

import java.util.ArrayList;

public class BusyStudent_1450 {
    public static void main(String[] args) {
        int startTime[] = {1,1,1,1};
        int endTime[] = {1,3,2,4};

        System.out.println(busyStudent(startTime,endTime,7));
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res = 0;

        for(int i = 0;i<startTime.length;i++){
            if(startTime[i]<=queryTime&&queryTime<=endTime[i]){
                res++;
            }
        }

        return res;
    }
}
