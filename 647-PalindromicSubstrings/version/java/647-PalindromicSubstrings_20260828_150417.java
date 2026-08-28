// Last updated: 8/28/2026, 3:04:17 PM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        int left = 0, right = matrix[0].length - 1;
4        int top = 0, bottom = matrix.length - 1;
5        List<Integer> results = new ArrayList();
6
7        while (left <= right && top <= bottom) {
8
9            for (int i = left; i <= right; i++) {
10                results.add(matrix[top][i]);
11            }
12            top++;
13            for (int j = top; j <= bottom; j++) {
14                results.add(matrix[j][right]);
15            }
16            right--;
17
18            if (top <= bottom) {
19                for (int i = right; i >= left; i--) {
20                    results.add(matrix[bottom][i]);
21                }
22                bottom--;
23            }
24
25            if (left <= right) {
26                for (int i = bottom; i >= top; i--) {
27                    results.add(matrix[i][left]);
28                }
29                left++;
30            }
31        }
32        return results;
33    }
34}