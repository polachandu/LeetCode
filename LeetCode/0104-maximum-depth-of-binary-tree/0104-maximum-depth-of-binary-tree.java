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
        ArrayList<Integer> al = new ArrayList();
        int count = 1;
        dfs(root, count,al);

        return Collections.max(al);
    }

    private void dfs(TreeNode root, int count, ArrayList<Integer> al) {

        if (root == null) {
            return;
        }
        al.add(count++);
        dfs(root.left, count,al);
        dfs(root.right, count,al);
    }

}