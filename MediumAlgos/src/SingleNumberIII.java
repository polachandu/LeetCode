//Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. 
//Find the two elements that appear only once. You can return the answer in any order.
//
//You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.
//
//Example 1:
//Input: nums = [1,2,1,3,2,5]
//Output: [3,5]
//Explanation:  [5, 3] is also a valid answer.

//Example 2:
//Input: nums = [-1,0]
//Output: [-1,0]

//Example 3:
//Input: nums = [0,1]
//Output: [1,0]


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumberIII {
	 
	public static int[] singleNumber(int[] nums) {
	
	List list = new ArrayList();
	 for(int i=0;i<nums.length;i++) {
			int j;
			for(j=0;j<nums.length;j++) {
				if(nums[i]==nums[j]&&i!=j) {
					break;
				}
			}if(j==nums.length) {
				list.add(nums[i]);
				
			}
			
		}
	 int[] n = new int[list.size()];
	 for(int i=0;i<list.size();i++) {
		 n[i] = (int) list.get(i);
	 }
	 return n;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,2,1,3,2,5};
		System.out.println(singleNumber(intArray));
	}

}
