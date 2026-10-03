// Last updated: 10/2/2026, 7:34:09 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int maxArea = Integer.MIN_VALUE;
4        int left = 0, right = height.length - 1;
5        while (left < right) {
6            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
7            if (height[left] < height[right]) {
8                left++;
9            } else {
10                right--;
11            }
12        }
13        return maxArea;
14    }
15}