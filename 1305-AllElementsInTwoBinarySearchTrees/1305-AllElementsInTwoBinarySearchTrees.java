// Last updated: 9/5/2026, 12:31:10 PM
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

    List<Integer> res = new ArrayList();

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        inorder(root1);
        inorder(root2);
        Collections.sort(res);
        return res;
    }

    public void inorder(TreeNode root){
        if(root == null) return;
        res.add(root.val);
        inorder(root.left);
        inorder(root.right);
    }
}