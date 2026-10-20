// Last updated: 10/19/2026, 7:47:37 PM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int m = matrix.length, n = matrix[0].length;
4        for (int i = 0; i < matrix.length; i++) {
5            for (int j = i + 1; j < matrix.length; j++) {
6                int temp = matrix[i][j];
7                matrix[i][j] = matrix[j][i];
8                matrix[j][i] = temp;
9            }
10        }
11        for (int i = 0; i < m; i++) {
12            int left = 0, right = n - 1;
13            while (left < right) {
14                int temp = matrix[i][left];
15                matrix[i][left] = matrix[i][right];
16                matrix[i][right] = temp;
17                left++;
18                right--;
19            }
20        }
21    }
22}