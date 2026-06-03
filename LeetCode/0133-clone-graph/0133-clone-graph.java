/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null)
            return node;
        HashMap<Node, Node> visited = new HashMap();
        Queue<Node> queue = new LinkedList();
        visited.put(node, new Node(node.val, new ArrayList()));
        queue.add(node);
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            for (Node nei : currentNode.neighbors) {
                if (!visited.containsKey(nei)) {
                    visited.put(nei, new Node(nei.val, new ArrayList()));
                    queue.add(nei);
                }
                visited.get(currentNode).neighbors.add(visited.get(nei));
            }
        }
        return visited.get(node);
    }
}