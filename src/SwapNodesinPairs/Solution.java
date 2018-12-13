package SwapNodesinPairs;

/**
 * Your algorithm should use only constant extra space.
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 */
public class Solution {

    public ListNode swapPairs(ListNode head) {
        boolean headSet = false;
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode prev = null;
        while (true) {
            p1.next = p2.next;
            p2.next = p1;
            if (!headSet) {
                head = p2;
                headSet = true;
            }
            if (prev != null) {
                prev.next = p2;
            }
            prev = p1;
            p1 = p1.next;
            if (p1 == null) break;
            p2 = p1.next;
            if (p2 == null) break;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);

        node1.next = node2;
        Solution s = new Solution();
        ListNode head = s.swapPairs(node1);
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
    }
}
