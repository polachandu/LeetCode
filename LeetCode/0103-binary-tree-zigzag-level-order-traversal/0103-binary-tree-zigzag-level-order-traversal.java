/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList();
        int count = 0;
        if (root == null)
            return new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> insider = new ArrayList();
            Queue<TreeNode> temp = new LinkedList();
            while (!queue.isEmpty()) {
                TreeNode curr = queue.poll();
                insider.add(curr.val);
                if (curr.left != null) {
                    temp.add(curr.left);
                }
                if (curr.right != null) {
                    temp.add(curr.right);
                }
            }
            queue = temp;
            count++;
            if (count % 2 == 0) {
                Collections.reverse(insider);
                results.add(insider);
            } else {
                results.add(insider);
            }
        }
        return results;
    }
}