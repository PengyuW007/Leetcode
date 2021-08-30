package Easy;

import java.util.ArrayList;
import java.util.List;

public class CountMatches_1773 {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<List<String>>();

        List<String> item1 = new ArrayList<String>();
        item1.add("phone");
        item1.add("blue");
        item1.add("pixel");

        List<String> item2 = new ArrayList<String>();
        item2.add("computer");
        item2.add("silver");
        item2.add("phone");

        List<String> item3 = new ArrayList<String>();
        item3.add("phone");
        item3.add("gold");
        item3.add("iphone");

        items.add(item1);
        items.add(item2);
        items.add(item3);

        System.out.println(countMatches(items, "type", "phone"));

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        int type = -1;
        if (ruleKey.equals("type")) {
            type = 0;
        } else if (ruleKey.equals("color")) {
            type = 1;
        } else  {
            type = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            List<String> item = items.get(i);
            if (item.get(type).equals(ruleValue)) {
                res++;
            }
        }

        return res;
    }
}
