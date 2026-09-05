// Last updated: 9/5/2026, 12:31:47 PM
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
    ArrayList<Object> al1 = new ArrayList();
    ArrayList<Object> al2 = new ArrayList();
    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        inorder1(root1);
        inorder2(root2);
        Object[] arr1 = al1.toArray();
        Object[] arr2 = al2.toArray();
        for(int i =0;i<al1.size();i++){
            for(int j=0; j<al2.size();j++){
                if((int)arr1[i]+(int)arr2[j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public void inorder1(TreeNode root){
        if(root == null) return;
        inorder1(root.left);
        al1.add(root.val);
        inorder1(root.right);
    }

    public void inorder2(TreeNode root){
        if(root == null) return;
        inorder2(root.left);
        al2.add(root.val);
        inorder2(root.right);
    }
}