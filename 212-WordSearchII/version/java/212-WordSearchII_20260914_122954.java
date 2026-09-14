// Last updated: 9/14/2026, 12:29:54 PM
1class Solution {
2    public String convert(String s, int numRows) {
3        if (numRows == 1 || numRows > s.length()) {
4            return s;
5        }
6
7        StringBuilder[] rows = new StringBuilder[numRows];
8        for (int i = 0; i < numRows; i++) {
9            rows[i] = new StringBuilder();
10        }
11        int currentRow = 0;
12        boolean isGoingDown = false;
13
14        for (char ch : s.toCharArray()) {
15            rows[currentRow].append(ch);
16
17            if (currentRow == 0 || currentRow == numRows - 1) {
18                isGoingDown = !isGoingDown;
19            }
20            currentRow += isGoingDown ? 1 : -1;
21        }
22
23        StringBuilder result = new StringBuilder();
24        for (StringBuilder row : rows) {
25            result.append(row);
26        }
27        return result.toString();
28    }
29}