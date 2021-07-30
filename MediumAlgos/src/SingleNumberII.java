//Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.
//
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//Example 1:
//Input: nums = [2,2,3,2]
//Output: 3

//Example 2:
//Input: nums = [0,1,0,1,0,1,99]
//Output: 99

import java.util.Arrays;

public class SingleNumberII {
	 public static int singleNumber(int[] nums) {
		
//		 int num=0;
//		 for(int i=0;i<nums.length;i++) {
//				int j;
//				for(j=0;j<nums.length;j++) {
//					if(nums[i]==nums[j]&&i!=j) {
//						break;
//					}
//				}if(j==nums.length) {
//					num= nums[i];
//					
//				}
//			}
		 Arrays.sort(nums);
	        
	        if(nums.length == 1)
	        {
	            return nums[0];
	        }
	        
	        if(nums[0] != nums[1])
	        {
	            return nums[0];
	        }
	        
	        
	        for(int i = 0; i <= nums.length - 3; i = i + 3)
	        {
	            if(nums[i] != nums[i + 2])
	                return nums[i];
	        }
	        
	        return nums[nums.length - 1];
			
		 }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {2,2,3,2};
		System.out.println(singleNumber(intArray));
		int[] intArray1 = {0,1,0,1,0,1,99};
		System.out.println(singleNumber(intArray1)); 
		int[] intArray2 = {30000,500,100,30000,100,30000,100};
		System.out.println(singleNumber(intArray2)); 
	}

}
