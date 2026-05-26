class WordDictionary {

    public WordDictionary() {

    }

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }

    TrieNode root = new TrieNode();

    public void addWord(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            if (current.children[ch - 'a'] == null) {
                current.children[ch - 'a'] = new TrieNode();
            }
            current = current.children[ch - 'a'];
        }
        current.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        return dfs(current, word, 0);
    }

    private boolean dfs(TrieNode node, String word, int index) {
        if (index == word.length())
            return node.isEnd;
        char ch = word.charAt(index);
        if (ch == '.') {
            for (TrieNode child : node.children) {
                if (child != null && dfs(child, word, index + 1))
                    return true;
            }
            return false;
        } else {
            if (node.children[ch - 'a'] == null)
                return false;
            return dfs(node.children[ch - 'a'], word, index + 1);
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */