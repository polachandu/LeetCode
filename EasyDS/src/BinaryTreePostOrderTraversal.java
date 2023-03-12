Given the root of a binary tree, return the postorder traversal of its nodes' values.
Example 1:
Input: root = [1,null,2,3]
Output: [3,2,1]
Example 2:
Input: root = []
Output: []
Example 3:
Input: root = [1]
Output: [1]

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
    public List<Integer> postorderTraversal(TreeNode root) {
        
     List<Integer> list = new ArrayList<>();
    if(root == null) return list;
      
    Stack<TreeNode> stack = new Stack<>();
    stack.add(root);
    while(!stack.empty()){
        root = stack.pop();
        list.add(0, root.val);
        if(root.left != null) stack.add(root.left);
        if(root.right != null) stack.add(root.right);
    }
    return list;
    }
}
