// Last updated: 10/26/2026, 9:12:57 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5        int left = 0;
6        int right = (rows * cols) - 1;
7        while (left <= right) {
8            int mid = left + (right - left) / 2;
9            int row = mid / cols;
10            int col = mid % cols;
11            if (matrix[row][col] == target) {
12                return true;
13            }
14            if (matrix[row][col] > target) {
15                right = mid - 1;
16            } else {
17                left = mid + 1;
18            }
19        }
20        return false;
21    }
22}