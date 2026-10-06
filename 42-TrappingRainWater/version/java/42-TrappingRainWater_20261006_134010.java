// Last updated: 10/6/2026, 1:40:10 PM
1class Solution {
2    public int trap(int[] height) {
3        int water = 0, left = 0, leftMax = 0, rightMax = 0, right = height.length - 1;
4        while (left < right) {
5            if (height[left] < height[right]) {
6                if (height[left] < leftMax) {
7                    water += leftMax - height[left];
8                }
9                leftMax = Math.max(leftMax, height[left]);
10                left++;
11            } else {
12                if (height[right] < rightMax) {
13                    water += rightMax - height[right];
14                }
15                rightMax = Math.max(rightMax, height[right]);
16                right--;
17            }
18        }
19        return water;
20    }
21}