//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets. 
//
//Example 1:
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]

//Example 2:
//Input: nums = []
//Output: []

//Example 3:
//Input: nums = [0]
//Output: []



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class ThreeSum {
	
	 public static ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
		 if(nums.length<3)
	            return new ArrayList();
		 //for removing duplicates we should use hashset.
	        HashSet<List<Integer>> set=new HashSet<>();
	        Arrays.sort(nums);
	        int n=nums.length;
	        for(int i=0;i<n-2;i++)
	        {
	            int j=i+1;
	            int k=n-1;
	            while(j<k)
	            {
	                int sum=nums[i]+nums[j]+nums[k];
	                if(sum==0)
	                    set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
	                else if(sum>0)
	                    k--;
	                else
	                    j++;
	            }
	        }
	        return new ArrayList(set);
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {-1,0,1,2,-1,-4};
			System.out.println(threeSum(intArray));
	}

}
