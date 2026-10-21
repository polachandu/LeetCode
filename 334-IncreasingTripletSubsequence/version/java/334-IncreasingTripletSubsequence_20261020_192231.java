// Last updated: 10/20/2026, 7:22:31 PM
1class Solution {
2    public boolean increasingTriplet(int[] nums) {
3        int firstNum = Integer.MAX_VALUE;
4        int secondNum = Integer.MAX_VALUE;
5        for (int num : nums) {
6            if (num <= firstNum) {
7                firstNum = num;
8            } else if (num <= secondNum) {
9                secondNum = num;
10            } else {
11                return true;
12            }
13        }
14        return false;
15    }
16}