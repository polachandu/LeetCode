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
    int result = 0;
    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        if (root == null)
            return 0;
        inorder(root);
        return result;
    }

    private void inorder(TreeNode root) {
        if (root == null || count == 0)
            return;
        inorder(root.left);
        count--;
        if (count == 0) {
            result = root.val;
        }
        inorder(root.right);
    }

}