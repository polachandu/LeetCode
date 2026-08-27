// Last updated: 8/27/2026, 12:41:42 PM
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
17    public int goodNodes(TreeNode root) {
18        return dfs(root, root.val);
19    }
20
21    private int dfs(TreeNode node, int maxSoFar) {
22        if (node == null) {
23            return 0;
24        }
25        int count = (node.val >= maxSoFar) ? 1 : 0;
26        maxSoFar = Math.max(node.val, maxSoFar);
27        count += dfs(node.left, maxSoFar);
28        count += dfs(node.right, maxSoFar);
29
30        return count;
31    }
32}