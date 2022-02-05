package Easy;

import java.util.Arrays;
import java.util.Collections;

public class $FlipAndInvertImage_832 {
    public static void main(String[] args) {
        int image[][] ={{1,1,0},{1,0,1},{0,0,0}};

        int [][]res = flipAndInvertImage(image);

        for(int i = 0;i< res.length;i++){
            for(int j = 0;j<res[i].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int []a = image[0];
        Collections.reverse(Arrays.asList(a));

        System.out.println(a[0]);

        for (int i = 0; i < image.length; i++) {
            Collections.reverse(Arrays.asList(image[i]));
            for(int j = 0;j<image[i].length;j++){
                /*
                if(temp[j]==1){
                    temp[j]=0;
                }else{
                    temp[j]=1;
                }

                 */
            }
        }

        return image;
    }
}
