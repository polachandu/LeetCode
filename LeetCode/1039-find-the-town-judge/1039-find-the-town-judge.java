class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length < n-1) return -1;
        
        int[] indegress = new int[n+1];
        int[] outdegress = new int[n+1];

        for(int[] relation : trust){
            outdegress[relation[0]]++;
            indegress[relation[1]]++;
        }

        for(int i=1;i<=n;i++){
            if(indegress[i] == n-1 && outdegress[i] == 0){
                return i;
            }
        }
        return -1;
    }
}