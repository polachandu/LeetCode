// Last updated: 10/6/2026, 12:56:29 PM
1class Solution {
2    public int trap(int[] height) {
3        int trap = 0;
4        int[] leftMax = new int[height.length];
5        leftMax[0] = height[0];
6        int[] rightMax = new int[height.length];
7        rightMax[height.length - 1] = height[height.length - 1];
8        for (int i = 1; i < height.length; i++) {
9            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
10        }
11        for (int i = height.length - 1; i > 0; i--) {
12            rightMax[i - 1] = Math.max(rightMax[i], height[i - 1]);
13        }
14        for (int i = 0; i < height.length; i++) {
15            int count = Math.min(rightMax[i], leftMax[i]) - height[i];
16            if (count > 0) {
17                trap += count;
18            }
19        }
20        return trap;
21    }
22}