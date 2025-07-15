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
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int lastValue = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode last = queue.poll();
                lastValue = last.val;
                if (last.left != null)
                    queue.add(last.left);
                if (last.right != null)
                    queue.add(last.right);
            }

            res.add(lastValue);
        }
        return res;
    }
}