// Last updated: 8/19/2026, 11:36:58 AM
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
18        if (root == null)
19            return new ArrayList();
20        List<List<Integer>> results = new ArrayList();
21        Queue<TreeNode> queue = new LinkedList();
22        queue.add(root);
23        while (!queue.isEmpty()) {
24            List<Integer> innerList = new ArrayList();
25            int size = queue.size();
26            for (int i = 0; i < size; i++) {
27                TreeNode current = queue.poll();
28                if (current != null) {
29                    innerList.add(current.val);
30                    if (current.left != null) {
31                        queue.add(current.left);
32                    }
33                    if (current.right != null) {
34                        queue.add(current.right);
35                    }
36                }
37            }
38            results.add(innerList);
39        }
40        return results;
41    }
42}