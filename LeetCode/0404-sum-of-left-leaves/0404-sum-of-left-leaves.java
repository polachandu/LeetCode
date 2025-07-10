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
    public int sumOfLeftLeaves(TreeNode root) {

    Queue<TreeNode> queue = new LinkedList<>();
    int sum = 0;
    queue.add(root);

    while(!queue.isEmpty()){
        TreeNode curNode = queue.poll();

        if(curNode.left != null && curNode.left.left == null && curNode.left.right == null){
            sum = sum+curNode.left.val;
        }

        if(curNode.right != null){
            queue.add(curNode.right);
        }

        if(curNode.left != null){
            queue.add(curNode.left);
        }
    }
    return sum;

    }
}