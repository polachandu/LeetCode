// Last updated: 10/7/2026, 5:07:03 PM
1class Solution {
2    public String addStrings(String num1, String num2) {
3        StringBuilder result = new StringBuilder();
4        int i = num1.length() - 1;
5        int j = num2.length() - 1;
6        int carry = 0;
7        while (i >= 0 || j >= 0 || carry > 0) {
8            int a = i >= 0 ? Integer.parseInt(String.valueOf(num1.charAt(i--))) : 0;
9            int b = j >= 0 ? Integer.parseInt(String.valueOf(num2.charAt(j--))) : 0;
10            int sum = a + b + carry;
11            carry = sum / 10;
12            result.append(sum % 10);
13        }
14        return result.reverse().toString();
15    }
16}