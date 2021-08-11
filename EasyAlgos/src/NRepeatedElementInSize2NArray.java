//You are given an integer array nums with the following properties:
//nums.length == 2 * n.
//nums contains n + 1 unique elements.
//Exactly one element of nums is repeated n times.
//Return the element that is repeated n times.
//Example 1:
//Input: nums = [1,2,3,3]
//Output: 3

//Example 2:
//Input: nums = [2,1,2,5,3,2]
//Output: 2

//Example 3:
//Input: nums = [5,1,5,2,5,3,5,4]
//Output: 5

import java.util.Arrays;

public class NRepeatedElementInSize2NArray {
		
	public static int repeatedNTimes(int[] nums) {
	       //Arrays.sort(nums);
		 Arrays.sort(nums);
	        for(int i=0;i<nums.length;i++) {
		        	for(int j=0;j<nums.length&&j != i;j++) {
		        		if(nums[i]==nums[j]) {
	                        return nums[i];
	                    }
		        	}
		        }
		        return 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,2,3,3};
		System.out.println(repeatedNTimes(intArray));
		
		int[] intArray1 = {2,1,2,5,3,2};
		System.out.println(repeatedNTimes(intArray1));
		
		int[] intArray2 = {5,1,5,2,5,3,5,4};
		System.out.println(repeatedNTimes(intArray2));
	}

}
