class Solution {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String prefix = null;
    }

    TrieNode root = new TrieNode();

    public String replaceWords(List<String> dictionary, String sentence) {
        for (String word : dictionary) {
            insert(word);
        }

        String[] words = sentence.split(" ");
        for(int i=0;i<words.length;i++){
            words[i] = findRoot(words[i]);
        }
        return String.join(" ", words);
    }

    private void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            if (current.children[ch - 'a'] == null) {
                current.children[ch - 'a'] = new TrieNode();
            }
            current = current.children[ch - 'a'];
        }
        current.prefix = word;
    }

    private String findRoot(String word){
        TrieNode current = root;
        for(char ch:word.toCharArray()){
            if(current.children[ch-'a'] == null) break;
            current = current.children[ch-'a'];
            if(current.prefix != null) return current.prefix;
        }
        return word;
    }
}