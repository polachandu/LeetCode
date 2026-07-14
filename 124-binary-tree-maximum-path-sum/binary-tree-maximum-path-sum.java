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
    Integer maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null)
            return 0;
        gain(root);
        return maxSum;
    }

    private int gain(TreeNode root) {
        if (root == null)
            return 0;

        int leftGain = Math.max(gain(root.left), 0);
        int rightGain = Math.max(gain(root.right), 0);

        int pathSum = root.val + leftGain + rightGain;
        maxSum = Math.max(pathSum, maxSum);

        return root.val + Math.max(leftGain, rightGain);
    }
}