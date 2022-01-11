package Easy;

import java.util.ArrayList;

public class OfferII_42 {

    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        System.out.println(obj.ping(1));
        System.out.println(obj.ping(100));
        System.out.println(obj.ping(3001));
        System.out.println(obj.ping(3002));
    }
}

class RecentCounter {
    private ArrayList<Integer> requests;

    public RecentCounter() {

        requests = new ArrayList<>();
    }

    public int ping(int t) {
        int counter = 0;
        if (!requests.contains(t)) {
            requests.add(t);
            for (int i = 0; i < requests.size(); i++) {
                if (t - 3000 <= requests.get(i) && requests.get(i) <= t) {
                    counter++;
                }
            }
        }

        return counter;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */