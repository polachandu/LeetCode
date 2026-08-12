// Last updated: 8/12/2026, 11:15:18 AM
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int firstNum = Integer.MAX_VALUE;
        int secondNum = Integer.MAX_VALUE;
        for(int num: nums){
            if(num <= firstNum){
                firstNum = num;
            }else if(num <= secondNum){
                secondNum = num;
            }else{
                return true;
            }
        }
        return false;
    }
}