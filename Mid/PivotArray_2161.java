package Mid;

public class PivotArray_2161 {
    public static void main(String[] args) {
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        nums = pivotArray(nums, 10);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

    public static int[] pivotArray(int[] nums, int pivot) {
        int pivotIndex = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == pivot) {
                pivotIndex = i;
                break;
            }
        }

        nums = swap(nums, pivotIndex, 0);

        int bigStart = 1;
        for (int curr = 1; curr < nums.length; curr++) {
            if (nums[curr] < pivot) {
                swap(nums, curr, bigStart);
                bigStart++;
            }
        }
        nums[0] = nums[bigStart - 1];
        nums[bigStart - 1] = pivot;

        return nums;
    }

    private static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
