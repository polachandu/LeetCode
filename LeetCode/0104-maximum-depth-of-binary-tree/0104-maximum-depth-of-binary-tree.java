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
    public int maxDepth(TreeNode root) {
    if(root == null) return 0;
    int count = 1;
    List<Integer> al = new ArrayList();
    dfs(root,al,count);
    return Collections.max(al);
    }

    private void dfs(TreeNode root, List<Integer> al,int count){
        if(root == null){
            return;
        }
        al.add(count++);
        dfs(root.right,al,count);
        dfs(root.left,al,count);
    }
}