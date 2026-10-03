// Last updated: 10/2/2026, 9:29:55 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> results = new ArrayList();
4        Arrays.sort(nums);
5        for (int i = 0; i < nums.length; i++) {
6            int j = i + 1;
7            int k = nums.length - 1;
8            if (i > 0 && nums[i] == nums[i - 1])
9                continue;
10            while (j < k) {
11                int sum = nums[i] + nums[j] + nums[k];
12                if (sum == 0 && i != j && j != k && k != i) {
13                    results.add(List.of(nums[i], nums[j], nums[k]));
14                    while (j < k && nums[j] == nums[j + 1]) {
15                        j++;
16                    }
17                    while (j < k && nums[k] == nums[k - 1]) {
18                        k--;
19                    }
20                    j++;
21                    k--;
22                }
23                if (sum < 0) {
24                    j++;
25                }
26                if (sum > 0) {
27                    k--;
28                }
29            }
30        }
31        return results;
32    }
33}