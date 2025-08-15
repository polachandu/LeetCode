class Solution {
    public boolean validTree(int n, int[][] edges) {
        
        if(edges.length != n-1) return false;

        List<List<Integer>> adjacencyList = new ArrayList();
        for(int i=0;i<n;i++){
            adjacencyList.add(new ArrayList());
        }
        for(int[] edge: edges){
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> queue = new LinkedList();
        Set<Integer> seen = new HashSet();
        queue.add(0);
        seen.add(0);

        while(!queue.isEmpty()){
            int node = queue.poll();
            for(int nei:adjacencyList.get(node)){
                if(seen.contains(nei)) continue;
                queue.add(nei);
                seen.add(nei);
            }
        }
        return seen.size() == n;
    }
}