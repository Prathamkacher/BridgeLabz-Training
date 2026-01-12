/*
8. String to integer (atoi)
*/

class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1, i = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+')
            sign = s.charAt(i++) == '-' ? -1 : 1;

        long num = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i++) - '0');
            if (num * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (num * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        return (int)(num * sign);
    }
}