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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        List<List<Integer>> result = new ArrayList();
        if (root == null)
            return result;
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentElement = queue.poll();
                currentLevel.add(currentElement.val);
                if (currentElement.left != null) {
                    queue.add(currentElement.left);
                }
                if (currentElement.right != null) {
                    queue.add(currentElement.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}