// Last updated: 9/18/2026, 1:00:44 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0, right = height.length - 1;
4        int maxArea = 0;
5        while (left < right) {
6            int area = Math.abs(left - right) * Math.min(height[left], height[right]);
7            maxArea = Math.max(area, maxArea);
8            if (height[left] < height[right]) {
9                left++;
10            } else {
11                right--;
12            }
13        }
14        return maxArea;
15    }
16}