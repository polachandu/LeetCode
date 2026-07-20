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
    List<Integer> al = new ArrayList();

    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root, al);
        return al;
    }

    private void postOrder(TreeNode root, List<Integer> al) {
        if (root == null) {
            return;
        }
        postOrder(root.left, al);
        postOrder(root.right, al);
        al.add(root.val);
    }
}