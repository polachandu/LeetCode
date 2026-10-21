// Last updated: 10/20/2026, 8:33:31 PM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        int top = 0, bottom = matrix.length - 1;
4        int left = 0, right = matrix[0].length - 1;
5        List<Integer> result = new ArrayList();
6        while (left <= right && top <= bottom) {
7            for (int i = left; i <= right; i++) {
8                result.add(matrix[top][i]);
9            }
10            top++;
11            for (int j = top; j <= bottom; j++) {
12                result.add(matrix[j][right]);
13            }
14            right--;
15            if (top <= bottom) {
16                for (int i = right; i >= left; i--) {
17                    result.add(matrix[bottom][i]);
18                }
19                bottom--;
20            }
21            if (left <= right) {
22                for (int i = bottom; i >= top; i--) {
23                    result.add(matrix[i][left]);
24                }
25                left++;
26            }
27        }
28        return result;
29    }
30}