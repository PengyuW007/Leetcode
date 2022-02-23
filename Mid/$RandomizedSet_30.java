package Mid;

import java.util.ArrayList;
import java.util.Random;

public class $RandomizedSet_30 {
    public static void main(String[] args) {
        RandomizedSet   randomSet =  new RandomizedSet();

        System.out.println(randomSet.insert(1));

        System.out.println(randomSet.remove(2));

        System.out.println(randomSet.insert(2));

        System.out.println(randomSet.getRandom());

        System.out.println(randomSet.remove(1));

        System.out.println(randomSet.insert(2));

        System.out.println(randomSet.getRandom());


    }
}

class RandomizedSet {
    private ArrayList<Integer> objs;


    public ArrayList<Integer>getObjs(){
        return objs;
    }

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        objs = new ArrayList<Integer>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        boolean res = false;
        if (!objs.contains(val)) {
            objs.add(val);
            res = true;
        }
        return res;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        boolean res = false;

        if (objs.contains(val)) {
            objs.remove(val);
            res = true;
        }
        return res;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        Random random = new Random();

        int len = objs.size();

        int index =  random.nextInt();

        return objs.get(index);
    }
}
