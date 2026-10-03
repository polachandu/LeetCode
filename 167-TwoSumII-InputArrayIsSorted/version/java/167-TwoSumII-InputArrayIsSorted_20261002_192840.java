// Last updated: 10/2/2026, 7:28:40 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int left = 0, right = numbers.length-1;
4        while (left < right) {
5            int sum = numbers[left] + numbers[right];
6            if (sum == target) {
7                return new int[] { left + 1, right + 1 };
8            }
9            if (sum > target) {
10                right--;
11            } else {
12                left++;
13            }
14        }
15        return new int[] { 0, 0 };
16    }
17}