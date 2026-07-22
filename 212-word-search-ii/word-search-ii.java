class Solution {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word = null;
    }

    TrieNode root = new TrieNode();
    List<String> results = new ArrayList();

    public List<String> findWords(char[][] board, String[] words) {
        for (String word : words) {
            insert(word);
        }
        TrieNode current = root;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, current, results);
            }
        }
        return results;
    }

    private void dfs(char[][] board, int row, int col, TrieNode current, List<String> results){
        if(current.word != null){
            results.add(current.word);
            current.word = null;
        }
        if(row <0 || col < 0 || row >=board.length || col >= board[0].length){
            return;
        }
        if(board[row][col] == '\0'){
            return;
        }

        TrieNode node = current.children[board[row][col]-'a'];
        if(node == null){
            return;
        }

        char temp = board[row][col];
        board[row][col] = '\0';

        dfs(board, row+1, col, node, results);
        dfs(board, row-1, col, node, results);
        dfs(board, row, col+1, node, results);
        dfs(board, row, col-1, node, results);

        board[row][col] = temp;

    }

    private void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            if (current.children[ch - 'a'] == null) {
                current.children[ch - 'a'] = new TrieNode();
            }
            current = current.children[ch - 'a'];
        }
        current.word = word;
    }
}