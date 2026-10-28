// Last updated: 10/28/2026, 12:04:45 PM
1class Solution {
2    public String decodeString(String s) {
3        Stack<Character> stack = new Stack();
4        StringBuilder result = new StringBuilder();
5        for (int i = 0; i < s.length(); i++) {
6            if (s.charAt(i) == ']') {
7                StringBuilder insider = new StringBuilder();
8                while (stack.peek() != '[') {
9                    insider.append(stack.pop());
10                }
11                stack.pop();
12                String block = insider.reverse().toString();
13                StringBuilder num = new StringBuilder();
14                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
15                    num.append(stack.pop());
16                }
17                Integer k = Integer.parseInt(num.reverse().toString());
18                for (int rep = 0; rep < k; rep++) {
19                    for (char ch : block.toCharArray()) {
20                        stack.push(ch);
21                    }
22                }
23            } else {
24                stack.push(s.charAt(i));
25            }
26        }
27        while (!stack.isEmpty()) {
28            result.append(stack.pop());
29        }
30        return result.reverse().toString();
31    }
32}