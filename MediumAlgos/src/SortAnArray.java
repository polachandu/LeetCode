import java.util.Arrays;

//Given an array of integers nums, sort the array in ascending order.
//
//Example 1:
//Input: nums = [5,2,3,1]
//Output: [1,2,3,5]

//Example 2:
//Input: nums = [5,1,1,2,0,0]
//Output: [0,0,1,1,2,5]

public class SortAnArray {
	 public static int[] sortArray(int[] nums) {
	        if(nums.length<= 1){
	            return nums;
	        }
	        int pivot = nums.length/2;
	        int[] left_list = sortArray(Arrays.copyOfRange(nums,0,pivot));
	        int[] right_list = sortArray(Arrays.copyOfRange(nums,pivot,nums.length));
	        return mergeSort(left_list,right_list);
	    }
	    public static int[] mergeSort(int[] left_list, int[] right_list){
	        int[] ret = new int[left_list.length+right_list.length];
	        int right_cursor =0;
	        int left_cursor = 0;
	        int ret_cursor =0;
	        while(left_cursor < left_list.length && right_cursor < right_list.length){
	            if(left_list[left_cursor] >right_list[right_cursor]){
	            ret[ret_cursor++] = right_list[right_cursor++];
	            }else{
	                ret[ret_cursor++] = left_list[left_cursor++];
	            }
	        }
	        while(left_cursor<left_list.length){
	            ret[ret_cursor++] = left_list[left_cursor++];
	        }
	        while(right_cursor<right_list.length){
	            ret[ret_cursor++] = right_list[right_cursor++];
	        }
	        return ret;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {5,1,1,2,0,0};
		System.out.println(Arrays.toString(sortArray(intArray)));
		int[] intArray1 = {5,2,3,1};
		System.out.println(Arrays.toString(sortArray(intArray1)));
	}

}
