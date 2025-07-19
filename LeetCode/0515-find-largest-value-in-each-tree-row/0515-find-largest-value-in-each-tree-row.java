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
    public List<Integer> largestValues(TreeNode root) {
        if(root == null) return new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        List<Integer> res = new ArrayList();
        while (!queue.isEmpty()) {
            Queue<TreeNode> temp = new LinkedList();
            Integer max = Integer.MIN_VALUE;
            while (!queue.isEmpty()) {
                TreeNode tempNode = queue.poll();
                if (tempNode.val > max) {
                    max = tempNode.val;
                }
                if (tempNode.left != null) {
                    temp.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    temp.add(tempNode.right);
                }
            }
            queue = temp;
            res.add(max);
        }
        return res;
    }
}