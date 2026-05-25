class Solution {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        List<String> suggestions = new ArrayList();
    }

    TrieNode root = new TrieNode();

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        Arrays.sort(products);
        for (String product : products) {
            insert(product);
        }

        List<List<String>> results = new ArrayList();
        TrieNode current = root;
        for (char ch : searchWord.toCharArray()) {
            if (current.children[ch - 'a'] == null) {
                while (results.size() < searchWord.length()) {
                    results.add(new ArrayList());
                }
                break;
            }
            current = current.children[ch - 'a'];
            results.add(current.suggestions);
        }
        return results;
    }

    private void insert(String product) {
        TrieNode current = root;
        for (char ch : product.toCharArray()) {
            if (current.children[ch - 'a'] == null) {
                current.children[ch - 'a'] = new TrieNode();
            }
            current = current.children[ch - 'a'];
            if (current.suggestions.size() < 3) {
                current.suggestions.add(product);
            }
        }
    }
}