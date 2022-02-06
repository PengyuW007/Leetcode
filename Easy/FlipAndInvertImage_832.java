package Easy;

public class FlipAndInvertImage_832 {
    public static void main(String[] args) {
        int image[][] = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        int[][] res = flipAndInvertImage(image);

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int[] temp = reverse(image[i]);
            for (int j = 0; j < temp.length; j++) {
                if (temp[j] == 1) {
                    temp[j] = 0;
                } else {
                    temp[j] = 1;
                }
            }
            image[i] = temp;
        }
        return image;
    }

    private static int[] reverse(int[] ori) {
        int len = ori.length;
        int[] temp = new int[ori.length];
        for (int i = 0; i < len; i++) {
            temp[len - 1 - i] = ori[i];
        }
        return temp;
    }
}
