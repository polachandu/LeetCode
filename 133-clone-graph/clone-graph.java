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
        Queue<Node> queue = new LinkedList();
        HashMap<Node, Node> visited = new HashMap();
        queue.add(node);
        visited.put(node, new Node(node.val));
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            for (Node nei : curr.neighbors) {
                if (!visited.containsKey(nei)) {
                    Node neiNode = new Node(nei.val);
                    queue.add(nei);
                    visited.put(nei, neiNode);
                }
                visited.get(curr).neighbors.add(visited.get(nei));
            }
        }
        return visited.get(node);
    }
}