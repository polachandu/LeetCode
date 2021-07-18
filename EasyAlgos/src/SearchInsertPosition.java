//Given a sorted array of distinct integers and a target value, return the index if the target is found.
//If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//Input: nums = [1,3,5,6], target = 5
//Output: 2

//Example 2:
//Input: nums = [1,3,5,6], target = 2
//Output: 1

//Example 3:
//Input: nums = [1,3,5,6], target = 7
//Output: 4

//Example 4:
//Input: nums = [1,3,5,6], target = 0
//Output: 0

//Example 5:
//Input: nums = [1], target = 0
//Output: 0

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,3,5,6};
		System.out.println(searchInsert(intArray,5));
		
		int[] intArray1 = {1,3,5,6};
		System.out.println(searchInsert(intArray,2));
		
		int[] intArray2 = {1,3,5,6};
		System.out.println(searchInsert(intArray,7));
		
		int[] intArray3 = {1,3,5,6};
		System.out.println(searchInsert(intArray,0));
		
		int[] intArray4 = {1};
		System.out.println(searchInsert(intArray,0));
		

	}
	public static int searchInsert(int[] nums, int target) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<target) {
				count++;
			}
			}
		
		
		
		
	return count;	
	}
	

}
