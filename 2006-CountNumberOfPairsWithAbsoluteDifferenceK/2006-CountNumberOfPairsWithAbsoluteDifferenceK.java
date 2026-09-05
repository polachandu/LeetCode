// Last updated: 9/5/2026, 12:28:52 PM
class Solution {
    public int countKDifference(int[] nums, int k) {
        int counter = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]-nums[j] < 0){
                    int posValue = -1 *(nums[i]-nums[j]);
                    if(posValue == k){
                        counter++;
                    }
                }else{
                    if(nums[i]-nums[j] == k){
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
}