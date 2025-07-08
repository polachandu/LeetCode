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
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode curNode = queue.poll();

            TreeNode temp = curNode.left;
            curNode.left = curNode.right;
            curNode.right = temp;

            if(curNode.left != null){
                queue.add(curNode.left);
            }
            if(curNode.right != null){
                queue.add(curNode.right);
            }
        }
        return root;
    }
}