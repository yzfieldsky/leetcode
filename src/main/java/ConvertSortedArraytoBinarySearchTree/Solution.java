package ConvertSortedArraytoBinarySearchTree;

import java.util.Arrays;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return func(nums, 0, nums.length - 1);
    }

    public TreeNode func(int[] nums, int begin, int end) {
        if (begin > end) {
            return null;
        }
        int mid = (begin + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = func(nums, begin, mid - 1);
        root.right = func(nums, mid + 1, end);
        return root;
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
