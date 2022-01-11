package Easy;

public class CountGoodTriplets_1534 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3};
        System.out.println(countGoodTriplets(arr,0,0,1));
    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int aRes = Math.abs(arr[i] - arr[j]);
                    int bRes = Math.abs(arr[j] - arr[k]);
                    int cRes = Math.abs(arr[i] - arr[k]);

                    if (aRes <= a && bRes <= b && cRes <= c) {
                        res++;
                    }
                }
            }
        }

        return res;
    }
}
