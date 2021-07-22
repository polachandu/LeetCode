//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
//To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. 
//nums2 has a length of n.
//
//Example 1:
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

//Example 2:
//Input: nums1 = [1], m = 1, nums2 = [], n = 0
//Output: [1]
//Explanation: The arrays we are merging are [1] and [].
//The result of the merge is [1].

//Example 3:
//Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//Output: [1]
//Explanation: The arrays we are merging are [] and [1].
//The result of the merge is [1].
//Note that because m = 0, there are no elements in nums1. 
//The 0 is only there to ensure the merge result can fit in nums1.
import java.util.Arrays;
public class MergeSortedArray {
	
	public static void merge(int[] nums3, int m, int[] nums4, int n) {
		
	int[] newArray = Arrays.copyOfRange(nums3, 0, m);
	int[] newArray1 = Arrays.copyOfRange(nums4, 0, n);
	
	System.arraycopy(newArray,0,nums3,0,m);
	System.arraycopy(newArray1,0,nums3,m,n);
	Arrays.sort(nums3);
	
	System.out.println(Arrays.toString(nums3));
	}
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		merge(nums1, 3, nums2, 3);
		
		int[] nums3 = {1};
		int[] nums4 = {};
		merge(nums3,1,nums4,0);
		}
}
