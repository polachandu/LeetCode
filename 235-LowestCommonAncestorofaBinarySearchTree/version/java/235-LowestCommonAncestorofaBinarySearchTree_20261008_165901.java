// Last updated: 10/8/2026, 4:59:01 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        if (root == null || root == p || root == q) {
14            return root;
15        }
16        TreeNode left = lowestCommonAncestor(root.left, p, q);
17        TreeNode right = lowestCommonAncestor(root.right, p, q);
18        if (left != null && right != null) {
19            return root;
20        }
21        return left != null ? left : right;
22    }
23}