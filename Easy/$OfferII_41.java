package Easy;

import java.util.ArrayList;

public class $OfferII_41 {
    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        System.out.println(movingAverage.next(1)); // 返回 1.0 = 1 / 1
        System.out.println(movingAverage.next(10)); // 返回 5.5 = (1 + 10) / 2
        System.out.println(movingAverage.next(3)); // 返回 4.66667 = (1 + 10 + 3) / 3
        System.out.println(movingAverage.next(5));; // 返回 6.0 = (10 + 3 + 5) / 3

        ArrayList<Integer>m = movingAverage.ma;


    }
}

class MovingAverage {
    ArrayList<Integer> ma;
    int size;

    /**
     * Initialize your data structure here.
     */
    public MovingAverage(int size) {
        ma = new ArrayList<Integer>();
        this.size = size;
    }

    public double next(int val) {
        ma.add(val);
        int cap = ma.size();
        double res;

        if (cap < 3) {
            int sum = 0;
            for (int i = cap - 1; i > 0; i--) {
                sum += ma.get(i);
            }
            res = sum / cap;
        } else {
            int sum = 0;
            for (int i = cap - 1; i > cap - 3; i--) {
                sum += ma.get(i);
            }
            res = sum / size;
        }

        return res;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
