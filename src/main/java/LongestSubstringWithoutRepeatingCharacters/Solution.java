package LongestSubstringWithoutRepeatingCharacters;

import java.util.*;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        int init = 1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (nums[i] > init) {
                    return init;
                } else if (nums[i] == init) {
                    init++;
                }
            }
        }
        return init;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {3, 4, -1, 1};
        int res = s.firstMissingPositive(arr);
        System.out.println(res);
    }
}
