package nextgreater;

public class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            int val = nums1[i];
            boolean find = false;
            for (int j = 0; j < nums2.length - 1; j++) {
                if (nums2[j] == val && nums2[j + 1] > val) {
                    nums1[i] = nums2[j + 1];
                    find = true;
                    break;
                }
            }
            if (!find) {
                nums1[i] = -1;
            }
        }
        return nums1;
    }

    public static void main(String[] args) {

    }
}
