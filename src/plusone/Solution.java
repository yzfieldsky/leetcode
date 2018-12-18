package plusone;

import java.util.Stack;

public class Solution {

    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int[] newarr = new int[length];
        boolean forward = true;
        for (int i = length - 1; i >= 0; i--) {
            if (forward) {
                if (digits[i] == 9) {
                    newarr[i] = 0;
                } else {
                    newarr[i] = digits[i] + 1;
                    forward = false;
                }
            } else {
                newarr[i] = digits[i];
            }
        }
        if (newarr[0] == 0) {
            newarr = new int[length + 1];
            newarr[0] = 1;
        }
        return newarr;
    }

    public static void main(String[] args) {
        int[] a = {9, 9, 9, 9, 9, 9};
        Solution s = new Solution();
        int[] res = s.plusOne(a);
        System.out.println(res.toString());
    }
}
