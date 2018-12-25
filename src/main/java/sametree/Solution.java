package sametree;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        Queue<TreeNode> q1 = new ArrayDeque<>();
        q1.add(p);
        Queue<TreeNode> q2 = new ArrayDeque<>();
        q2.add(q);
        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode node1 = q1.remove();
            TreeNode node2 = q2.remove();
            if (node1.val != node2.val) {
                return false;
            }
            TreeNode left1 = node1.left;
            TreeNode left2 = node2.left;
            if (left1 != null && left2 != null) {
                q1.add(left1);
                q2.add(left2);
            } else if (left1 == null && left2 == null) {
                //nothing
            } else {
                return false;
            }
            TreeNode right1 = node1.left;
            TreeNode right2 = node2.left;
            if (right1 != null && right2 != null) {
                q1.add(right1);
                q2.add(right2);
            } else if (right1 == null && right2 == null) {
                //nothing
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println();
    }

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
