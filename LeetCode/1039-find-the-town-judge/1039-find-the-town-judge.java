class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1) return 1;
        int[][] degree = new int[n+1][2];
        for(int[] trustee: trust){
            int a = trustee[0];
            int b = trustee[1];
            degree[a][0]++;
            degree[b][1]++;
        }
        for(int i=0;i<n+1;i++){
            if(degree[i][0] == 0 && degree[i][1] == n-1){
                return i;
            }
        }
        return -1;
    }
}