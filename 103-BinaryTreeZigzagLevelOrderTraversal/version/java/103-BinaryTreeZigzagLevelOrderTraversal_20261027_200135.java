// Last updated: 10/27/2026, 8:01:35 PM
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        if (root == null)
19            return new ArrayList();
20        int count = 0;
21        List<List<Integer>> results = new ArrayList();
22        Queue<TreeNode> queue = new LinkedList();
23        queue.add(root);
24        while (!queue.isEmpty()) {
25            int size = queue.size();
26            List<Integer> innerList = new ArrayList();
27            for (int i = 0; i < size; i++) {
28                TreeNode curr = queue.poll();
29                if (curr != null) {
30                    innerList.add(curr.val);
31
32                    if (curr.left != null) {
33                        queue.add(curr.left);
34                    }
35                    if (curr.right != null) {
36                        queue.add(curr.right);
37                    }
38                }
39            }
40            if (count % 2 != 0) {
41                Collections.reverse(innerList);
42                results.add(innerList);
43            } else {
44                results.add(innerList);
45            }
46            count++;
47        }
48
49        return results;
50    }
51}