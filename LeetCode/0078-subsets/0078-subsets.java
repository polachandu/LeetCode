class Solution {


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        backTrack(0, nums, result,new ArrayList());
        return result;
    }

    private void backTrack(int curr, int[] nums, List<List<Integer>> result, List<Integer> subset){
        result.add(new ArrayList(subset));
        for(int i=curr;i<nums.length;i++){
            subset.add(nums[i]);
            backTrack(i+1,nums,result,subset);
            subset.remove(subset.size()-1);
        }
    }
   
}