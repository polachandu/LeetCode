// Last updated: 8/25/2026, 3:10:53 PM
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
17    boolean flag = true;
18
19    public boolean isBalanced(TreeNode root) {
20        if (root == null)
21            return true;
22        dfs(root);
23        return flag;
24    }
25
26    private int dfs(TreeNode root) {
27        if (root == null)
28            return 0;
29        int leftHeight = dfs(root.left);
30        int rightHeight = dfs(root.right);
31        if (Math.abs(leftHeight - rightHeight) > 1) {
32            flag = false;
33        }
34        return 1 + Math.max(leftHeight, rightHeight);
35    }
36}