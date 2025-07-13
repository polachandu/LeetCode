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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> insider = new ArrayList<>();
            Queue<TreeNode> temp = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode tempNode = queue.poll();
                if(tempNode != null){
                    insider.add(tempNode.val);
                    if(tempNode.left != null){
                        temp.add(tempNode.left);
                    }
                    if(tempNode.right != null){
                        temp.add(tempNode.right);
                    }
                }
            }
            queue = temp;
            res.add(insider);
        }
        Collections.reverse(res);
        return res;
    }
}