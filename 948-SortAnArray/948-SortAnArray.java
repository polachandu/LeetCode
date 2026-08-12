// Last updated: 8/12/2026, 11:12:27 AM
class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length<= 1){
            return nums;
        }
        int pivot = nums.length/2;
        int[] left_list = sortArray(Arrays.copyOfRange(nums,0,pivot));
        int[] right_list = sortArray(Arrays.copyOfRange(nums,pivot,nums.length));
        return mergeSort(left_list,right_list);
    }
    public int[] mergeSort(int[] left_list, int[] right_list){
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
}