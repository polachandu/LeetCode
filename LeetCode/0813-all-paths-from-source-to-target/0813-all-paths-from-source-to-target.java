class Solution {
    private int target;
    private int[][] graph;
    private List<List<Integer>> results;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.target = graph.length-1;
        this.graph = graph;
        this.results = new ArrayList<List<Integer>>();
        LinkedList<Integer> path = new LinkedList<Integer>();
        path.add(0);
        backtrack(0,path);
        return this.results;
    }

    private void backtrack(int curNode, LinkedList<Integer> path){
        if(curNode == this.target){
            this.results.add(new ArrayList<Integer>(path));
            return;
        }

        for(int nextNode: this.graph[curNode]){
            path.addLast(nextNode);
            backtrack(nextNode,path);
            path.removeLast();
        }
    }
}