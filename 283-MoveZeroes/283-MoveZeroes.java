// Last updated: 8/12/2026, 11:15:34 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int writer=0;
        for(int reader = 0; reader<nums.length;reader++){
             if(nums[reader] != 0){
                nums[writer] = nums[reader];
                writer++;
             }

        }
        while(writer < nums.length){
            nums[writer] = 0;
            writer++;
        }
    }
}