class Solution {
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        backtrack(n, path, res);
        return res;
    }

    private void backtrack(int n, StringBuilder path, List<String> res) {
        if (path.length() == n) {
            res.add(path.toString());     
            return;
        }

        path.append('1');
        backtrack(n, path, res);
        path.deleteCharAt(path.length() - 1); 

        if (path.length() == 0 || path.charAt(path.length() - 1) != '0') {
            path.append('0');
            backtrack(n, path, res);
            path.deleteCharAt(path.length() - 1); 
        }
    }
}