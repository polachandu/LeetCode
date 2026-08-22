// Last updated: 8/21/2026, 9:46:30 PM
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
17    int count = 0;
18    int result = 0;
19
20    public int kthSmallest(TreeNode root, int k) {
21        dfs(root, k);
22        return result;
23    }
24
25    private void dfs(TreeNode root, int k) {
26        if (root == null) {
27            return;
28        }
29
30        dfs(root.left, k);
31        count++;
32        if (count == k) {
33            result = root.val;
34            return;
35        }
36        dfs(root.right, k);
37    }
38}