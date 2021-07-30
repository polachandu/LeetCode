//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
//
//Follow-up: Could you solve the problem in linear time and in O(1) space?
//
//Example 1:
//Input: nums = [3,2,3]
//Output: [3]

//Example 2:
//Input: nums = [1]
//Output: [1]

//Example 3:
//Input: nums = [1,2]
//Output: [1,2]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MajorityElementII {
	public static List<Integer> majorityElement(int[] nums) {

			HashMap<Integer,Integer> l = new HashMap<>();
			List ans = new ArrayList<>();
			for(int i=0;i<nums.length;i++)
			{
			if(!l.containsKey(nums[i]))
			{
			l.put(nums[i],1);
			}
			else
			{			l.put(nums[i],l.get(nums[i])+1);
			}
			}
			for(int key:l.keySet())
			{
			if(l.get(key)>nums.length/3)
			{
			ans.add(key);
			}
			}
			return ans;
		
		
//		Set<Integer> result = new HashSet<>();
//        int dsCount = nums.length / 3;
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length; i++) {
//            int currNum = nums[i];
//            int currCount = 0;
//            int j;
//            for (j = i; j < nums.length; j++) {
//                if (currNum != nums[j]) {
//                    break;
//                } else {
//                    currCount++;
//                }
//            }
//            System.out.println(nums[i]);
//            System.out.println(currCount);
//            if (currCount > dsCount) {
//                result.add(currNum);
//            }
//        }
//        
        return new ArrayList<>(result);
		}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {3,2,3};
		System.out.println(majorityElement(intArray));
		int[] intArray1 = {1};
		System.out.println(majorityElement(intArray1));
		int[] intArray2 = {1, 2};
		System.out.println(majorityElement(intArray2));
		
	}

}
