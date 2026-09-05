// Last updated: 9/5/2026, 12:29:22 PM
class Solution {
    public int findCenter(int[][] edges) {
        int[] degree = new int[edges.length+2];
        for(int[] edge : edges){
            int a = edge[0];
            int b = edge[1];
            degree[a]++;
            degree[b]++;
        }

        for(int i=0;i<=edges.length+2;i++){
            if(degree[i] == edges.length){
                return i;
            }
        }
        return -1;
    }
}