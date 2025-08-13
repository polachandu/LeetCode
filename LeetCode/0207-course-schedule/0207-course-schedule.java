class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>(numCourses);

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList());
        }

        for(int[] prerequiste : prerequisites){
            adj.get(prerequiste[1]).add(prerequiste[0]);
            indegree[prerequiste[0]]++;
        }

        Queue<Integer> queue = new LinkedList();
        for(int i=0;i<numCourses;i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        int nodesVisited = 0;
        while(!queue.isEmpty()){
            int node = queue.poll();
            nodesVisited++;
            for(int neigh:adj.get(node)){
                indegree[neigh]--;
                if(indegree[neigh] == 0){
                    queue.add(neigh);
                }
            }
        }
        return nodesVisited == numCourses;
    }
}