// Last updated: 9/5/2026, 12:30:55 PM
class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        
        Arrays.sort(satisfaction);
        
        int currentSum = 0;
        int maxSum = 0;
        int increment = 0;
        int i = satisfaction.length - 1;
        
        while (i >= 0) {
            increment += satisfaction[i];
            currentSum += increment;
            maxSum = Math.max(currentSum, maxSum);
            --i;
        }
        
        return maxSum;
    }
}