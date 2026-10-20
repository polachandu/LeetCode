// Last updated: 10/19/2026, 5:49:29 PM
1class Solution {
2    public int minPartitions(String n) {
3        int result = 0;
4        for (int i = 0; i < n.length(); i++) {
5            result = Math.max(result, n.charAt(i)-'0');
6        }
7        return result;
8    }
9}