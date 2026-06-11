class Solution {

    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (dfs(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, String word, int count) {
        if (count == word.length())
            return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }
        if (board[i][j] != word.charAt(count))
            return false;
        if (board[i][j] == '\0')
            return false;

        char temp = board[i][j];
        board[i][j] = '\0';

        boolean found = dfs(board, i + 1, j, word, count + 1) ||
                dfs(board, i - 1, j, word, count + 1) ||
                dfs(board, i, j + 1, word, count + 1) ||
                dfs(board, i, j - 1, word, count + 1);

        board[i][j] = temp;
        return found;
    }
}