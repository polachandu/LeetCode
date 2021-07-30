//Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
//
//Example 1:
//Input: nums = [-1,2,1,-4], target = 1
//Output: 2
//Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).


import java.util.Arrays;

public class ThreeSumCloset {
	
	 public static int threeSumClosest(int[] nums, int target) {
		 int n = nums.length;
	        Arrays.sort(nums);
     int prevdif = Integer.MAX_VALUE;
     int ans = 0;
	        for(int i=0;i<n-2;i++) {
	        	int j=i+1;
	        	int k = n-1;
	        	while(j<k) {
	        		int a = nums[i]+nums[j]+nums[k];
	        		if(a==target) {
	        			return a;
	        		}
                 int dif = Math.abs(a-target);
                 if(dif<prevdif){
                     prevdif = dif;
                     ans = a;
                 }
                 else if(a < target) {
	        			j++;
	        		}else {
	        			k--;
	        		}
	        	}
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {-1,2,1,-4};
		System.out.println(threeSumClosest(intArray,1));
		int[] intArray1 = {0,1,2};
		System.out.println(threeSumClosest(intArray1,3));
		
	}

}
