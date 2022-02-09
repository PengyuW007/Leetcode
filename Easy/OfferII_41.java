package Easy;

import java.util.ArrayList;

public class OfferII_41 {
    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        System.out.println(movingAverage.next1(1)); // 返回 1.0 = 1 / 1
        System.out.println(movingAverage.next1(10)); // 返回 5.5 = (1 + 10) / 2
        System.out.println(movingAverage.next1(3)); // 返回 4.66667 = (1 + 10 + 3) / 3
        System.out.println(movingAverage.next1(5)); // 返回 6.0 = (10 + 3 + 5) / 3
        movingAverage.clear();
    }
}

class MovingAverage {
    ArrayList<Integer> ma;
    int size, sum;

    /**
     * Initialize your data structure here.
     */
    public MovingAverage(int size) {
        ma = new ArrayList<Integer>();
        this.size = size;
        sum = 0;
    }

    public int clear() {
        ma.clear();
        return ma.size();
    }

    public double next1(int val) {
        sum += val;
        if (ma.size() == size) {
            sum -= ma.get(0);
            ma.remove(0);
        }
        ma.add(val);
        return (double) sum / ma.size();
    }

    public double next2(int val) {
        ma.add(val);
        int cap = ma.size();
        double res;

        if (cap > 0 && cap < 3) {
            double sum = 0.0;
            if (cap == 1) {
                sum += ma.get(cap - 1);
            } else {
                sum = ma.get(cap - 1) + ma.get(cap - 2);
            }
            res = sum / cap;
        } else {
            double sum;
            sum = ma.get(cap - 1) + ma.get(cap - 2) + ma.get(cap - 3);
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
