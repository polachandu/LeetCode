// Last updated: 8/12/2026, 11:10:50 AM
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int rows[] = new int[matrix.length];
        int columns[] = new int[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++){
                min = Math.min(matrix[i][j],min);
            }
            rows[i] = min;
        } 

        for(int i=0;i<matrix[0].length;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                max=Math.max(matrix[j][i],max);
            }
            columns[i] = max;
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(rows[i]==columns[j]){
                    result.add(rows[i]);
                }
            }
        }
        return result;
    }
}