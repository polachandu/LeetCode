//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//The overall run time complexity should be O(log (m+n)).
//
//Example 1:
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.

//Example 2:
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

//Example 3:
//Input: nums1 = [0,0], nums2 = [0,0]
//Output: 0.00000

//Example 4:
//Input: nums1 = [], nums2 = [1]
//Output: 1.00000

//Example 5:
//Input: nums1 = [2], nums2 = []
//Output: 2.00000

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] newArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, newArray, 0, nums1.length);
        System.arraycopy(nums2, 0, newArray, nums1.length, nums2.length);
        Arrays.sort(newArray);
        int n = newArray.length;
        if(n%2 == 0) {
        	return (((double)(newArray[n/2]+newArray[n/2 -1])/2));
        	
        }
        else {
        	return newArray[n/2];
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		System.out.println(findMedianSortedArrays(nums1, nums2));
		
		int[] nums3 = {1,3};
		int[] nums4 = {2,4};
		System.out.println(findMedianSortedArrays(nums3, nums4));
		
		int[] nums5 = {};
		int[] nums6 = {1};
		System.out.println(findMedianSortedArrays(nums5, nums6));
		
		int[] nums7 = {2};
		int[] nums8 = {};
		System.out.println(findMedianSortedArrays(nums7, nums8));
	}

}
