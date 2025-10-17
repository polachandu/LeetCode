class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        double[] maxProb = new double[n];
        maxProb[start_node] = 1.0;

        for(int i=0;i<n-1;i++){
            boolean hasUpdate = false;
            for(int j=0;j<edges.length;j++){
                int u = edges[j][0];
                int v = edges[j][1];
                if(maxProb[u] * succProb[j] > maxProb[v]){
                    maxProb[v] = maxProb[u]*succProb[j];
                    hasUpdate = true;
                }
                if(maxProb[v] * succProb[j] > maxProb[u]){
                    maxProb[u] = maxProb[v]*succProb[j];
                    hasUpdate = true;
                }
            }
            if(!hasUpdate){
                break;
            }
        }
        return maxProb[end_node];
    }
}