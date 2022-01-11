package Easy;

import java.util.ArrayList;

public class GetDecimalValue_1290 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1, null)));
        System.out.println(getDecimalValue(head));
    }

    public static int getDecimalValue(ListNode head) {
        int res;
        ArrayList<Integer> bin = new ArrayList<>();

        String binString = "";
        int i = 0;

        while (head != null) {
            bin.add(head.val);
            binString += bin.get(i);
            i++;
            head = head.next;
        }

        res = Integer.parseInt(binString, 2);

        return res;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
