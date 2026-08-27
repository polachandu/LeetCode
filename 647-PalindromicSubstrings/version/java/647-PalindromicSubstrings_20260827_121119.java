// Last updated: 8/27/2026, 12:11:19 PM
1class Trie {
2
3    class TrieNode {
4        TrieNode[] children = new TrieNode[26];
5        boolean isEnd = false;
6    }
7
8    TrieNode root;
9
10    public Trie() {
11        root = new TrieNode();
12    }
13
14    public void insert(String word) {
15        TrieNode current = root;
16        for (char ch : word.toCharArray()) {
17            if (current.children[ch - 'a'] == null) {
18                current.children[ch - 'a'] = new TrieNode();
19            }
20            current = current.children[ch - 'a'];
21        }
22        current.isEnd = true;
23    }
24
25    public boolean search(String word) {
26        TrieNode current = root;
27        for (char ch : word.toCharArray()) {
28            if (current.children[ch - 'a'] == null) {
29                return false;
30            }
31            current = current.children[ch - 'a'];
32        }
33        return current.isEnd;
34    }
35
36    public boolean startsWith(String prefix) {
37        TrieNode current = root;
38        for (char ch : prefix.toCharArray()) {
39            if (current.children[ch - 'a'] == null) {
40                return false;
41            }
42            current = current.children[ch - 'a'];
43        }
44        return true;
45    }
46}
47
48/**
49 * Your Trie object will be instantiated and called as such:
50 * Trie obj = new Trie();
51 * obj.insert(word);
52 * boolean param_2 = obj.search(word);
53 * boolean param_3 = obj.startsWith(prefix);
54 */