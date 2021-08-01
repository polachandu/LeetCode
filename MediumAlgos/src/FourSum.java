//Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
//0 <= a, b, c, d < n
//a, b, c, and d are distinct.
//nums[a] + nums[b] + nums[c] + nums[d] == target
//You may return the answer in any order.

//Example 1:
//Input: nums = [1,0,-1,0,-2,2], target = 0
//Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

//Example 2:
//Input: nums = [2,2,2,2,2], target = 8
//Output: [[2,2,2,2]]


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	
	 public static List<List<Integer>> fourSum(int[] nums, int target) {
	        int n = nums.length;
	        Arrays.sort(nums);
	        List<List<Integer>> result = new ArrayList<>();
	        if(nums == null || n<4){
	            return result;
	        }
	        for(int i=0;i<n-3;i++){
	            for(int j=i+1;j<n-2;j++){
	                int low = j+1;
	                int high = n-1;
	                while(low<high){
	                    int sum = nums[i]+nums[j]+nums[low]+nums[high];
	                    if(sum==target){
	                        List<Integer> list = new ArrayList<>();
	                        list.add(nums[i]);
	                        list.add(nums[j]);
	                        list.add(nums[low]);
	                        list.add(nums[high]);
	                        if(result.contains(list) == false){
	                            result.add(list);
	                        }
	                    
	                    low++;
	                
	                    high--;
	                }
	                    else if(sum<target){
	                        low++;
	                    }
	                    else{
	                        high--;
	                    }
	                }
	            }
	        }
	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,0,-1,0,-2,2};
		System.out.println(fourSum(intArray,0));
	}

}
