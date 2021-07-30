//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. 
//You may assume that the majority element always exists in the array.
//
//Example 1:
//Input: nums = [3,2,3]
//Output: 3

//Example 2:
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2

public class majorityElement {
	
	 public static int majorityElement(int[] nums) {
		 int major = nums.length/2;
	        for(int i=0;i<nums.length;i++){
	            int count = 0;
	            for(int j=1;j<nums.length;j++){
	                if(nums[i]==nums[j]){
	                    count++;
	                }
	                if(count > major){
	                    return nums[i];
	                }
	            }
	        }
	        return nums[0];
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {3,2,3};
		System.out.println(majorityElement(intArray));
		int[] intArray1 = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(intArray1));
		
	}

}
