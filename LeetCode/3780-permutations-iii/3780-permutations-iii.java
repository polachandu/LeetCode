class Solution {
    public int[][] permute(int n) {
        List<int[]> result = new ArrayList<>();
        boolean[] used = new boolean[n + 1];
        int[] curr = new int[n];
        backtrack(curr, 0, used, n, result);

        return result.toArray(new int[result.size()][n]);
    }

    private void backtrack(int[] curr, int depth, boolean[] used, int n, List<int[]> result) {
        if (depth == n) {
            result.add(curr.clone());
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (used[i])
                continue;

            if (depth > 0 && (curr[depth - 1] % 2 == i % 2))
                continue;

            used[i] = true;
            curr[depth] = i;
            backtrack(curr, depth + 1, used, n, result);
            used[i] = false;
        }
    }
}