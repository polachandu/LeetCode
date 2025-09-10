class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        backTracking(result,new ArrayList(),nums,0);
        return result;
    }

    private void backTracking(List<List<Integer>> result,List<Integer> subset,int[] nums,int first){
        result.add(new ArrayList(subset));
        for(int i=first;i<nums.length;i++){
            subset.add(nums[i]);
            backTracking(result,subset,nums,i+1);
            subset.remove(subset.size()-1);
        }
    }
}