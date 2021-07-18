//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

//Example 1:
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.

//Example 2:
//Input: nums = [1]
//Output: 1

//Example 3:
//Input: nums = [5,4,-1,7,8]
//Output: 23


public class maximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(intArray));
		
		int[] intArray1 = {1};
		System.out.println(maxSubArray(intArray1));
		
		int[] intArray2 = {5,4,-1,7,8};
		System.out.println(maxSubArray(intArray2));

	}
	 public static int maxSubArray(int[] nums) {
	        int n = nums.length;
	        int a = nums[0];
	        int b = nums[0];
	        for(int i=1;i<n;i++){
	            if(a+nums[i]<nums[i]){
	                a=nums[i];
	            }else{
	                a=a+nums[i];
	            }
	            if(a>b){
	                b=a;
	            }
	            
	        }
	        return b;
	    }

}
