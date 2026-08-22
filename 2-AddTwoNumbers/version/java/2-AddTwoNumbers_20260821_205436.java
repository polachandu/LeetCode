// Last updated: 8/21/2026, 8:54:36 PM
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
17    int diameter = 0;
18
19    public int diameterOfBinaryTree(TreeNode root) {
20        dfs(root);
21        return diameter;
22    }
23
24    private int dfs(TreeNode root) {
25        if (root == null) {
26            return 0;
27        }
28        int leftHeight = dfs(root.left);
29        int rightHeight = dfs(root.right);
30        diameter = Math.max(diameter, leftHeight + rightHeight);
31        return 1 + Math.max(rightHeight, leftHeight);
32    }
33}