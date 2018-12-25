package MergeSortedArray;

import java.util.Arrays;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 */
public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < n + m; i++) {
            nums1[i] = nums2[i - m];
        }
        //System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        System.out.println(1);
    }

}
