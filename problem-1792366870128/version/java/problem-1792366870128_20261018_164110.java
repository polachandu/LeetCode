// Last updated: 10/18/2026, 4:41:10 PM
1class Solution {
2    public int brokenCalc(int startValue, int target) {
3        int ops = 0;
4        while (target > startValue) {
5            if (target % 2 == 0) {
6                target = target / 2;
7            } else {
8                target = target + 1;
9            }
10            ops++;
11        }
12        ops += startValue - target;
13        return ops;
14    }
15}