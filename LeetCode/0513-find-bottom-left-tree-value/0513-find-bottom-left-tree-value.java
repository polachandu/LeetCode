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
    private int maxDepth;
    private int bottomLeftValue;

    public int findBottomLeftValue(TreeNode root) {
        maxDepth = -1;
        bottomLeftValue = 0;
        dfs(root,0);
        return bottomLeftValue;
    }
    private void dfs(TreeNode root, int depth){
        if(root == null) return;
        if(depth > maxDepth){
            maxDepth = depth;
            bottomLeftValue = root.val;
        }
        dfs(root.left, depth+1);
        dfs(root.right, depth+1);
    }
}