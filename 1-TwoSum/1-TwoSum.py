# Last updated: 8/20/2026, 4:17:21 PM
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if (i !=j) and (target == nums[i]+nums[j]):
                    return [i,j]
        