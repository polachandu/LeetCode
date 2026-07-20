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
    List<Integer> arrayList = new ArrayList();

    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root, arrayList);
        return arrayList;
    }

    private void preorder(TreeNode root, List<Integer> arrayList) {
        if (root == null) {
            return;
        }
        arrayList.add(root.val);
        preorder(root.left, arrayList);
        preorder(root.right, arrayList);
    }
}