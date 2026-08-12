// Last updated: 8/12/2026, 11:15:36 AM
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
    ArrayList<Integer> al = new ArrayList();
    public int closestValue(TreeNode root, double target) {
        inorder(root);
        return Collections.min(al, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return Math.abs(o1-target)<Math.abs(o2-target) ? -1: 1;
            }
        });
    }

    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
    }
}