// Last updated: 8/12/2026, 11:07:35 AM
class Solution {
    public int distributeCandies(int n, int limit) {
        int count = 0;
        for(int i=0;i<=limit;i++){
            for(int j=0;j<=limit;j++){
                for(int k=0;k<=limit;k++){
                    if(i+j+k == n){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}