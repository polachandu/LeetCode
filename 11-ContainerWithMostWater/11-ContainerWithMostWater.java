// Last updated: 8/20/2026, 4:17:02 PM
class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            result = Math.max(result, (Math.min(height[left], height[right])) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}