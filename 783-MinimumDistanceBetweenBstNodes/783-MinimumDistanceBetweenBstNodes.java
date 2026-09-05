// Last updated: 9/5/2026, 12:32:59 PM
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
    int min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (Math.abs((arr[i] - arr[j])) < min)
                    min = Math.abs((arr[i] - arr[j]));
            }
        }
        return min;
    }

    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
    }
}