// Last updated: 9/5/2026, 12:27:47 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if((nums[i] % 3) != 0){
                count++;
            }
        }
        return count;
    }
}