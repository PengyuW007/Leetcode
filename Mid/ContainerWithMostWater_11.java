package Mid;

public class ContainerWithMostWater_11 {
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(twoPointerMaxArea(nums));

    }

    public static int twoPointerMaxArea(int[] heights) {
        int max = 0;
        int left = 0,right = heights.length-1;

        while(left<right) {
            int product = (right - left) * Math.min(heights[left], heights[right]);

            max = Math.max(max, product);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }

    public static int naiveMaxArea(int[] height) {
       int max = 0;
        int product = 0;
        for(int i = 0;i<height.length;i++){
            for(int j=height.length-1;j>=0;j--){
                int shorter =0;
                if(height[i]>height[j])
                     shorter = height[j];
                else
                    shorter = height[i];
                product = Math.abs(i-j)*shorter;
                if(max<product)
                    max = product;
            }
        }
        return max;
    }
}
