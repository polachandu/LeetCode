// Last updated: 9/5/2026, 12:29:55 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int max =  0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }
            if(sum > max){
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
}