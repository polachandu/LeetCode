// Last updated: 9/13/2026, 5:18:19 PM
1class Solution {
2
3    class TrieNode {
4        TrieNode[] children = new TrieNode[26];
5        String word = null;
6    }
7
8    TrieNode root = new TrieNode();
9    List<String> results = new ArrayList();
10
11    public List<String> findWords(char[][] board, String[] words) {
12        for (String word : words) {
13            append(word);
14        }
15        TrieNode current = root;
16        for (int i = 0; i < board.length; i++) {
17            for (int j = 0; j < board[0].length; j++) {
18                dfs(board, i, j, current, results);
19            }
20        }
21        return results;
22    }
23
24    private void dfs(char[][] board, int row, int col, TrieNode current, List<String> results) {
25        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
26            return;
27        }
28        if (board[row][col] == '\0') {
29            return;
30        }
31        TrieNode node = current.children[board[row][col] - 'a'];
32
33        if (node == null) {
34            return;
35        }
36        if (node.word != null) {
37            results.add(node.word);
38            node.word = null;
39        }
40
41        char temp = board[row][col];
42        board[row][col] = '\0';
43
44        dfs(board, row + 1, col, node, results);
45        dfs(board, row - 1, col, node, results);
46        dfs(board, row, col + 1, node, results);
47        dfs(board, row, col - 1, node, results);
48
49        board[row][col] = temp;
50
51    }
52
53    private void append(String currentWord) {
54        TrieNode current = root;
55        for (char ch : currentWord.toCharArray()) {
56            if (current.children[ch - 'a'] == null) {
57                current.children[ch - 'a'] = new TrieNode();
58            }
59            current = current.children[ch - 'a'];
60        }
61        current.word = currentWord;
62    }
63}