// Last updated: 10/7/2026, 3:41:43 PM
1class Solution {
2    public String addStrings(String num1, String num2) {
3        StringBuilder sb = new StringBuilder();
4        int last = Math.max(num1.length(), num2.length());
5        StringBuilder modifiedNum1 = new StringBuilder(num1);
6        StringBuilder modifiedNum2 = new StringBuilder(num2);
7        String addedNum1 = "";
8        String addedNum2 = "";
9        int num1Length = num1.length();
10        int num2Length = num2.length();
11        if (num1Length <= last) {
12            while (num1Length != last) {
13                modifiedNum1.insert(0, "0");
14                num1Length++;
15            }
16            addedNum1 = modifiedNum1.toString();
17        }
18        if (num2Length <= last) {
19            while (num2Length != last) {
20                modifiedNum2.insert(0, "0");
21                num2Length++;
22            }
23            addedNum2 = modifiedNum2.toString();
24        }
25
26        int carry = 0;
27        for (int i = last - 1; i >= 0; i--) {
28            int a = Integer.parseInt(String.valueOf(addedNum1.charAt(i)));
29            int b = Integer.parseInt(String.valueOf(addedNum2.charAt(i)));
30            int sum = a + b + carry;
31            carry = sum / 10;
32            sb.append(sum % 10);
33        }
34        if (carry > 0) {
35            sb.append(carry);
36        }
37        return sb.reverse().toString();
38    }
39}