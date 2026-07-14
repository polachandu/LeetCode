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
    StringBuilder sb = new StringBuilder();
    int index = 0;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        construct(root, sb);
        return sb.toString();
    }

    private void construct(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return;
        }
        sb.append(root.val + ",");
        construct(root.left, sb);
        construct(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        return build(nodes);
    }

    private TreeNode build(String[] nodes) {
        if (nodes[index].equals("null")) {
            index++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(nodes[index++]));
        node.left = build(nodes);
        node.right = build(nodes);
        return node;
    }

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));