// Last updated: 10/8/2026, 5:03:54 PM
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
13        if (root == null) {
14            return root;
15        }
16        if (p.val <= root.val && root.val <= q.val) {
17            return root;
18        }
19        if (p.val > root.val && q.val > root.val) {
20            return lowestCommonAncestor(root.right, p, q);
21        }
22        if (p.val < root.val && q.val < root.val) {
23            return lowestCommonAncestor(root.left, p, q);
24        }
25        return root;
26    }
27}