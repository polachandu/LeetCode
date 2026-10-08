// Last updated: 10/8/2026, 1:13:05 PM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        if (root == null) {
19            return new ArrayList();
20        }
21        List<List<Integer>> results = new ArrayList();
22
23        Queue<TreeNode> queue = new LinkedList();
24        queue.add(root);
25        while (!queue.isEmpty()) {
26            int queueSize = queue.size();
27            List<Integer> currentList = new ArrayList();
28            for (int i = 0; i < queueSize; i++) {
29                TreeNode current = queue.poll();
30                currentList.add(current.val);
31                if (current.left != null) {
32                    queue.add(current.left);
33                }
34                if (current.right != null) {
35                    queue.add(current.right);
36                }
37            }
38            results.add(currentList);
39
40        }
41        return results;
42    }
43}