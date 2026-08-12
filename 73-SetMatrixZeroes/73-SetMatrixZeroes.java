// Last updated: 8/12/2026, 11:18:53 AM
class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> iSet = new HashSet();
        Set<Integer> jSet = new HashSet();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    iSet.add(i);
                    jSet.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (iSet.contains(i) || jSet.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}