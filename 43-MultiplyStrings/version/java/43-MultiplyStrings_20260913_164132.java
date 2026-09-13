// Last updated: 9/13/2026, 4:41:32 PM
1class Solution {
2    public String multiply(String num1, String num2) {
3        int m = num1.length(), n = num2.length();
4        int[] result = new int[m + n];
5        for (int i = m - 1; i >= 0; i--) {
6            for (int j = n - 1; j >= 0; j--) {
7                int n1 = num1.charAt(i) - '0';
8                int n2 = num2.charAt(j) - '0';
9                int product = n1 * n2;
10                int pos1 = i + j, pos2 = i + j + 1;
11                int sum = product + result[pos2];
12
13                result[pos2] = sum % 10;
14                result[pos1] += sum / 10;
15            }
16        }
17        StringBuilder resultBuilder = new StringBuilder();
18        for (int res : result) {
19            if (!(resultBuilder.length() == 0 & res == 0)) {
20                resultBuilder.append(res);
21            }
22        }
23        return resultBuilder.length() == 0 ? "0" : resultBuilder.toString();
24    }
25}