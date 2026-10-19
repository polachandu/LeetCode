// Last updated: 10/18/2026, 5:17:21 PM
1class Solution {
2    public boolean isValid(String s) {
3        StringBuilder sb = new StringBuilder(s);
4        boolean result = false;
5        int size = s.length();
6        int i = 0;
7        while (size != 0 && i != size) {
8            if (i + 2 < size && sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'b' && sb.charAt(i + 2) == 'c') {
9                sb.delete(i, i + 3);
10                size -= 3;
11                i = 0;
12            } else {
13                i++;
14            }
15        }
16        return sb.isEmpty();
17    }
18}