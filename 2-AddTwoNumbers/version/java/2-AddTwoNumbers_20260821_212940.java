// Last updated: 8/21/2026, 9:29:40 PM
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
17    public int kthSmallest(TreeNode root, int k) {
18        List<Integer> result = new ArrayList();
19        Queue<TreeNode> queue = new LinkedList();
20        queue.add(root);
21
22        while (!queue.isEmpty()) {
23            TreeNode curr = queue.poll();
24            result.add(curr.val);
25            if (curr.left != null) {
26                queue.add(curr.left);
27            }
28            if (curr.right != null) {
29                queue.add(curr.right);
30            }
31        }
32        Collections.sort(result);
33        return result.get(k - 1);
34    }
35}