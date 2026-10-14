// Last updated: 10/14/2026, 1:32:29 PM
1class Solution {
2    public String smallestSubsequence(String s) {
3        Map<Character, Integer> map = new HashMap();
4        StringBuilder result = new StringBuilder();
5        Stack<Character> stack = new Stack();
6        Set<Character> visited = new HashSet();
7        stack.push(s.charAt(0));
8        visited.add(s.charAt(0));
9        for (int i = 0; i < s.length(); i++) {
10            map.put(s.charAt(i), i);
11
12        }
13        for (int i = 1; i < s.length(); i++) {
14            char curr = s.charAt(i);
15            if (visited.contains(curr)) {
16                continue;
17            }
18            while (!stack.isEmpty() && map.get(stack.peek()) >= i && stack.peek() > curr) {
19                char toBeRemoved = stack.pop();
20                visited.remove(toBeRemoved);
21            }
22            stack.push(curr);
23            visited.add(curr);
24        }
25        while (!stack.isEmpty()) {
26            result.append(stack.pop());
27        }
28        return result.reverse().toString();
29    }
30}