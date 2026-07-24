class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        backTrack(result, 0, 0, new StringBuilder(), n);
        return result;
    }

    private void backTrack(List<String> result, int leftCount, int rightCount, StringBuilder sb, int n) {
        if (sb.length() == 2 * n) {
            result.add(sb.toString());
            return;
        }
        if (leftCount < n) {
            sb.append("(");
            backTrack(result, leftCount + 1, rightCount, sb, n);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (rightCount < leftCount) {
            sb.append(")");
            backTrack(result, leftCount, rightCount + 1, sb, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}