// Last updated: 9/5/2026, 12:30:13 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0;i<mat.length;i++){
            sum += mat[i][i];
            sum += mat[mat.length-1-i][i];
        }
        if(mat.length % 2 != 0){
            sum -=mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}