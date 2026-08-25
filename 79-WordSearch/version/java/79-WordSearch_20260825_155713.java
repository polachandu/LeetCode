// Last updated: 8/25/2026, 3:57:13 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> rightSideView(TreeNode root) {
18
19        if (root == null)
20            return new ArrayList();
21
22        List<Integer> results = new ArrayList();
23        Queue<TreeNode> queue = new LinkedList();
24        queue.add(root);
25
26        while (!queue.isEmpty()) {
27            int size = queue.size();
28            for (int i = 0; i < size; i++) {
29                TreeNode current = queue.poll();
30                if (size - 1 == i) {
31                    results.add(current.val);
32                }
33
34                if (current.left != null) {
35                    queue.add(current.left);
36                }
37                if (current.right != null) {
38                    queue.add(current.right);
39                }
40
41            }
42        }
43        return results;
44    }
45}