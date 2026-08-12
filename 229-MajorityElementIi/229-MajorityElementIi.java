// Last updated: 8/12/2026, 11:16:05 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> result = new HashSet<>();
        int dsCount = nums.length / 3;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int currNum = nums[i];
            int currCount = 0;
            int j;
            for (j = i; j < nums.length; j++) {
                if (currNum != nums[j]) {
                    break;
                } else {
                    currCount++;
                }
            }
            System.out.println(nums[i]);
            System.out.println(currCount);
            if (currCount > dsCount) {
                result.add(currNum);
            }
        }
        
        return new ArrayList<>(result);
    }
}