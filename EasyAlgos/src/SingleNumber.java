//Given a non-empty array of integers nums, every element appears twice except for one. 
//Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//Example 1:
//Input: nums = [2,2,1]
//Output: 1

//Example 2:
//Input: nums = [4,1,2,1,2]
//Output: 4

//Example 3:
//Input: nums = [1]
//Output: 1

public class SingleNumber {

	
	public static int singleNumber(int[] nums) {
		//Arrays.sort(nums);
        if(nums.length==1) {
        	return nums[0];
        }else {
        	int res = nums[0];
        	for(int i=1;i<nums.length;i++) {
        		res = res ^ nums[i];
        		}
        	return res;
        			}
        		}
        	
        
       
    


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {2, 2, 1};
		System.out.println(singleNumber(intArray));
		int[] intArray1 = {4, 1, 2, 1, 2};
		System.out.println(singleNumber(intArray1));
	}

}
