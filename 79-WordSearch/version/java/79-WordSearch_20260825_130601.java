// Last updated: 8/25/2026, 1:06:01 PM
1class Solution {
2    public boolean exist(char[][] board, String word) {
3        for (int i = 0; i < board.length; i++) {
4            for (int j = 0; j < board[0].length; j++) {
5                if (backTrack(board, i, j, word, 0)) {
6                    return true;
7                }
8            }
9        }
10        return false;
11    }
12
13    private boolean backTrack(char[][] board, int row, int col, String word, int index) {
14        if (index == word.length()) {
15            return true;
16        }
17
18        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] == '\0') {
19            return false;
20        }
21
22        if (board[row][col] != word.charAt(index)) {
23            return false;
24        }
25        char temp = board[row][col];
26        board[row][col] = '\0';
27        boolean found = backTrack(board, row + 1, col, word, index + 1) ||
28                backTrack(board, row - 1, col, word, index + 1) ||
29                backTrack(board, row, col + 1, word, index + 1) ||
30                backTrack(board, row, col - 1, word, index + 1);
31        board[row][col] = temp;
32
33        return found;
34    }
35}