package MergeTwoSortetLists;

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(99999);// dump node
        ListNode res = head;
        while (true) {
            if (l1 == null && l2 == null) {
                break;
            }
            if (l1 != null && l2 != null) {
                int v1 = l1.val;
                int v2 = l2.val;
                if (v1 <= v2) {
                    res.next = l1;
                    l1 = l1.next;
                } else {
                    res.next = l2;
                    l2 = l2.next;
                }
            } else {
                if (l1 == null) {
                    res.next = l2;
                }
                if (l2 == null) {
                    res.next = l1;
                }
                break;
            }
            res = res.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n4;

        ListNode s1 = new ListNode(1);
        ListNode s2 = new ListNode(2);
        ListNode s3 = new ListNode(3);
        s1.next = s2;
        s2.next = s3;

        Solution s = new Solution();
        ListNode res = s.mergeTwoLists(n1, s1);
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
