package Mid;

public class CountPoints_1828 {
    public static void main(String[] args) {
        int points[][] = {{1,3},{3,3},{5,3},{2,2}};
        int queries[][] = {{2,3,1},{4,3,1},{1,1,2}};

        int res [] = countPoints2(points,queries);

        for(int i = 0;i< res.length;i++){
            System.out.println(res[i]);
        }
    }

    public static int[] countPoints1(int[][] points, int[][] queries) {
        int res[]=new int[queries.length];

        for(int i = 0;i< queries.length;i++){
            int count =0;

            int x = queries[i][0];
            int y = queries[i][1];
            int r = queries[i][2];

            for(int j = 0;j< points.length;j++){
                int a = points[j][0];
                int b = points[j][1];

                int dis = (int)Math.sqrt(Math.pow(b-y,2)+Math.pow(a-x,2));

                if(dis<=r){
                    count++;
                }
            }
            res[i]=count;
        }

        return res;
    }

    public static int[] countPoints2(int[][] points, int[][] queries){
        int[] res=new int[queries.length];
        int count=0;

        for(int i=0;i<queries.length;i++){
            for(int j=0;j<points.length;j++){
                if(Math.sqrt(Math.pow(queries[i][0]-points[j][0],2) +Math.pow(queries[i][1]-points[j][1],2)) <= queries[i][2] ){
                    count++;
                }
            }
            res[i]=count;
            count=0;
        }
        return res;
    }
}
