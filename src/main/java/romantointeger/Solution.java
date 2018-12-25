package romantointeger;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        char[] chararray = s.toCharArray();
        int length = chararray.length;
        for (int i = 0; i < length; i++) {
            char ch = chararray[i];
            Integer value = map.get(ch);
            if ((ch == 'I') && (i + 1 < length) && (chararray[i + 1] == 'V' || chararray[i + 1] == 'X')) {
                value = -value;
            }
            if ((ch == 'X') && (i + 1 < length) && (chararray[i + 1] == 'L' || chararray[i + 1] == 'C')) {
                value = -value;
            }
            if ((ch == 'C') && (i + 1 < length) && (chararray[i + 1] == 'D' || chararray[i + 1] == 'M')) {
                value = -value;
            }
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String input = "MCMXCIV";
        int res = s.romanToInt(input);
        System.out.println(res);
    }
}
