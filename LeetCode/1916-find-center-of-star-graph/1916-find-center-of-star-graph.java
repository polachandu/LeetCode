class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        int[] degrees = new int[n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=1;j++){
                int num = edges[i][j];
                degrees[num-1]++;
            }
        }
        for(int i=0;i<n+1;i++){
            if(degrees[i] == n){
                return i+1;
            }
        }
    return -1;
    }
}