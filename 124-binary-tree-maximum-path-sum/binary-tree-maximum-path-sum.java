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
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null)
            return 0;
        gain(root);
        return maxSum;
    }

    private int gain(TreeNode node) {
        if (node == null)
            return 0;
        int leftGain = Math.max(gain(node.left), 0);
        int rightGain = Math.max(gain(node.right), 0);

        int pathSum = node.val + leftGain + rightGain;
        maxSum = Math.max(maxSum, pathSum);

        return node.val + Math.max(rightGain, leftGain);
    }
}