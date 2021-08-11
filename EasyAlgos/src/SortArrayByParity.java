//Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//Return any array that satisfies this condition.
//
//Example 1:
//Input: nums = [3,1,2,4]
//Output: [2,4,3,1]
//Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

//Example 2:
//Input: nums = [0]
//Output: [0]
import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayByParity {
	public static int[] sortArrayByParity(int[] nums) {
		ArrayList list1 = new ArrayList<>();
		ArrayList list2 = new ArrayList<>();
	        for(int i=0;i<nums.length;i++) {
	        	if(nums[i]%2 ==0) {
	        		list1.add(nums[i]);
	        	}
	        }
	        for(int i=0;i<nums.length;i++) {
	        	if(nums[i]%2 !=0) {
	        		list2.add(nums[i]);
	        	}
	        }
	        list1.addAll(list2);
	        int[] newNums = new int[nums.length];
	        for(int i=0;i<list1.size();i++) {
	        	newNums[i] = (int) list1.get(i);
	        }
	        
	       return newNums; 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {3,1,2,4};
		System.out.println(Arrays.toString(sortArrayByParity(intArray)));
		
		int[] intArray1 = {0};
		System.out.println(Arrays.toString(sortArrayByParity(intArray1)));
	}

}
