// Last updated: 8/20/2026, 4:16:53 PM
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
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
}