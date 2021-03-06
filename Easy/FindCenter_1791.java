package Easy;

import java.util.ArrayList;
import java.util.Comparator;

public class FindCenter_1791 {
    public static void main(String[] args) {
        int edges[][]={{1,2},{5,1},{1,3},{1,4}};

        System.out.println(findCenter(edges));
    }


    public static int findCenter(int[][] edges) {
        int center = 0;

        int row = edges[0][0];
        int col = edges[0][1];

        int r1=edges[1][0];
        int c1=edges[1][1];

        if(row==r1){
            center=row;
        }else if(row==c1){
            center=row;
        }else if(col==r1){
            center=col;
        }else if(col==c1){
            center=col;
        }

        return center;
    }
}
