// Last updated: 8/12/2026, 11:10:47 AM
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