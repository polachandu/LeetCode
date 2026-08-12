// Last updated: 8/12/2026, 11:13:46 AM
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
    ArrayList<Integer> al = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        dfs(root);
        Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]+arr[j] == k){
                    return true;
                }
            }
        }
        return false;
    }
    public void dfs(TreeNode root){
        if(root == null) return;
        dfs(root.left);
        al.add(root.val);
        dfs(root.right);
    }
}