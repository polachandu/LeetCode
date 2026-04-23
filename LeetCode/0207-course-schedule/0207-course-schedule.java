class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> adjacencyList = new ArrayList();

        for(int i=0;i<numCourses;i++){
            adjacencyList.add(new ArrayList());
        }

        for(int[] preq:prerequisites){
            adjacencyList.get(preq[1]).add(preq[0]);
            indegree[preq[0]]++;
        }

        Queue<Integer> queue = new LinkedList();
        for(int i=0;i<numCourses;i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        int nodesVisited=0;
        while(!queue.isEmpty()){
            int node = queue.poll();
            nodesVisited++;
            for(int neigh:adjacencyList.get(node)){
                indegree[neigh]--;
                if(indegree[neigh] == 0) queue.add(neigh);
            }
        }
    return numCourses == nodesVisited;
    }
}