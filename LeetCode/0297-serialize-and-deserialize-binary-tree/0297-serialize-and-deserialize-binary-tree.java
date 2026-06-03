/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        return sb.toString();
    }

    private void dfs(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return;
        }
        sb.append(root.val + ",");
        dfs(root.left, sb);
        dfs(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        int[] index = { 0 };
        String[] nodes = data.split(",");
        return build(nodes, index);
    }

    private TreeNode build(String[] nodes, int[] index) {
        if (nodes[index[0]].equals("null")) {
            index[0]++;
            return null;
        }
        TreeNode current = new TreeNode(Integer.parseInt(nodes[index[0]++]));
        current.left = build(nodes, index);
        current.right = build(nodes, index);
        return current;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));