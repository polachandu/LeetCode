// Last updated: 10/14/2026, 12:34:32 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
12        Map<TreeNode, List<TreeNode>> graph = new HashMap();
13        dfs(graph, root, null);
14        Set<TreeNode> visited = new HashSet();
15        Queue<TreeNode> queue = new LinkedList();
16        queue.add(target);
17        visited.add(target);
18
19        while (!queue.isEmpty() && k > 0) {
20            int size = queue.size();
21            for (int i = 0; i < size; i++) {
22                TreeNode node = queue.poll();
23                for (TreeNode nei : graph.get(node))
24                    if (nei != null) {
25                        if (!visited.contains(nei)) {
26                            visited.add(nei);
27                            queue.add(nei);
28                        }
29                    }
30            }
31            k--;
32        }
33
34        List<Integer> results = new ArrayList<>();
35        for (TreeNode node : queue) {
36            results.add(node.val);
37        }
38        return results;
39    }
40
41    private void dfs(Map<TreeNode, List<TreeNode>> graph, TreeNode root, TreeNode parent) {
42        if (root == null) {
43            return;
44        }
45        graph.putIfAbsent(root, new ArrayList());
46        if (parent != null) {
47            graph.get(root).add(parent);
48        }
49        if (root.left != null) {
50            graph.get(root).add(root.left);
51            dfs(graph, root.left, root);
52        }
53        if (root.right != null) {
54            graph.get(root).add(root.right);
55            dfs(graph, root.right, root);
56        }
57    }
58}