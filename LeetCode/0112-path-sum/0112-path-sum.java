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
    boolean flag;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        dfs(root, targetSum,0);
        return flag;
    }

    private void dfs(TreeNode root, int targetSum,int sum) {
        if (root != null) {
            sum += root.val;
            if (root.left == null && root.right == null) {
                if (sum == targetSum) {
                    flag = true;
                    return;
                } 
            }
            dfs(root.left, targetSum, sum);
            dfs(root.right, targetSum, sum);
        }

    }
}