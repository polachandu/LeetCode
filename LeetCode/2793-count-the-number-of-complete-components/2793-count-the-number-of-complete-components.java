class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
       List<Integer>[] graph = new ArrayList[n];
       Map<List<Integer>,Integer> componentFreq= new HashMap();

       for(int i=0;i<n;i++){
        graph[i] = new ArrayList();
        graph[i].add(i);
       }
       for(int[] edge :edges){
        graph[edge[0]].add(edge[1]);
        graph[edge[1]].add(edge[0]);
       }

       for(int i=0;i<n;i++){
        List<Integer> neighbors = graph[i];
        Collections.sort(neighbors);
        componentFreq.put(neighbors, componentFreq.getOrDefault(neighbors, 0)+1);
       }

       int result = 0;
       for(Map.Entry<List<Integer>,Integer> entry:componentFreq.entrySet()){
        if(entry.getKey().size() == entry.getValue()){
            result++;
        }
       }
    return result;
    }
}