package ValidParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        if (s == null) {
            return false;
        }
        int length = s.length();
        if (length == 0)
            return true;
        if (length % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            Character ch = s.charAt(i);
            if (map.containsKey(ch)) {
                stack.push(ch);
            } else {
                Character top = stack.isEmpty() ? '#' : stack.pop();
                if (!map.get(top).equals(ch)) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String input = "([{}])(}";
        Solution s = new Solution();
        boolean valid = s.isValid(input);
        System.out.println(valid);
    }

}
