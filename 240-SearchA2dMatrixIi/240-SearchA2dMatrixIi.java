// Last updated: 8/12/2026, 11:15:50 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int a = 0;
        int b = n-1;
        while(a<m && b>=0){
            if(matrix[a][b] == target){
                return true;
            }
            else if(matrix[a][b]>target){
                b--;
            }else{
                a++;
            }
        }
        return false;
    }
}