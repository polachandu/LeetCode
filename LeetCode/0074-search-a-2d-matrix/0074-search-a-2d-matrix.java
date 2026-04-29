class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int numCols = matrix[0].length;
        int right = matrix.length * numCols - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int row = mid / numCols;
            int col = mid % numCols;
            if (matrix[row][col] == target) {
                return true;
            }
            if (matrix[row][col] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}