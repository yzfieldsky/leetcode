package permutation;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        recusive(nums, 0, nums.length, res);
        return res;
    }

    private void recusive(int[] nums, int start, int length, List<List<Integer>> res) {
        if (start == length) {
            res.add(getList(nums));
        } else {
            for (int i = start; i < length; i++) {
                swap(nums, start, i);
                recusive(nums, start + 1, length, res);
                swap(nums, start, i);
            }
        }
    }

    private void swap(int[] nums, int start, int i) {
        int tmp = nums[start];
        nums[start] = nums[i];
        nums[i] = tmp;
    }

    private List<Integer> getList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6};
        List<List<Integer>> res = s.permute(nums);
        System.out.println(res);
    }

}
