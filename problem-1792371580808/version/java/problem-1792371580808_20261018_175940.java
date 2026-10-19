// Last updated: 10/18/2026, 5:59:40 PM
1class Solution {
2    public boolean isValid(String s) {
3        if (s.length() % 3 != 0)
4            return false;
5
6        char[] array = new char[s.length()];
7        int top = 0;
8
9        for (int i = 0; i < s.length(); i++) {
10            char ch = s.charAt(i);
11            array[top] = ch;
12            if (ch == 'c' && top >= 2 && array[top - 1] == 'b' && array[top - 2] == 'a') {
13                top -= 3;
14            }
15            top++;
16        }
17        return top == 0;
18    }
19}