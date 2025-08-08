/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, List<TreeNode>> graph = new HashMap();
        dfs(graph, root, null);
        List<Integer> list = new ArrayList();
        getElementsList(graph, target, null, k, list);
        return list;
    }

    private void dfs(Map<TreeNode, List<TreeNode>> graph, TreeNode node, TreeNode parent){
        if(node != null){
            if(!graph.containsKey(node)){
                graph.put(node,  new LinkedList<TreeNode>());
            }
            if(!graph.containsKey(parent)){
                graph.put(parent, new LinkedList<TreeNode>());
            }
            graph.get(node).add(parent);
            graph.get(parent).add(node);
            dfs(graph,node.left,node);
            dfs(graph,node.right,node);
        }
    }

    private void getElementsList(Map<TreeNode, List<TreeNode>> graph, TreeNode node, TreeNode prev, int k, List<Integer> list) {
        if(node == null) return;
        if (k == 0) {
            list.add(node.val);
            return;
        }

        for (TreeNode nei : graph.getOrDefault(node, Collections.emptyList())) {
            if (nei == prev) continue;           
            getElementsList(graph, nei ,node, k - 1, list);
        }
    }
}