/**
 * Definition for a rope tree node.
 * class RopeTreeNode {
 *     int len;
 *     String val;
 *     RopeTreeNode left;
 *     RopeTreeNode right;
 *     RopeTreeNode() {}
 *     RopeTreeNode(String val) {
 *         this.len = 0;
 *         this.val = val;
 *     }
 *     RopeTreeNode(int len) {
 *         this.len = len;
 *         this.val = "";
 *     }
 *     RopeTreeNode(int len, RopeTreeNode left, RopeTreeNode right) {
 *         this.len = len;
 *         this.val = "";
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public char getKthCharacter(RopeTreeNode root, int k) {
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        return sb.toString().charAt(k-1);
    }

    private void dfs(RopeTreeNode root, StringBuilder sb) {

        if (root != null) {
            if (root.left == null && root.right == null) {
                sb.append(root.val);
            }
            dfs(root.left, sb);
            dfs(root.right, sb);
        }
    }
}