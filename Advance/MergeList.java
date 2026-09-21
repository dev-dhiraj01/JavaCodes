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

class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Base Case 1
        if (list1 == null)
            return list2;

        // Base Case 2
        if (list2 == null)
            return list1;

        // Compare current nodes
        if (list1.val < list2.val) {

            list1.next = mergeTwoLists(list1.next, list2);

            return list1;
        } else {

            list2.next = mergeTwoLists(list1, list2.next);

            return list2;
        }
    }
}

public class MergeList {

    // Print Linked List
    static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        // First List
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Second List
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        Solution obj = new Solution();

        ListNode ans = obj.mergeTwoLists(list1, list2);

        print(ans);
    }
}