// Last updated: 10/2/2026, 9:34:58 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> results = new ArrayList();
5        for (int i = 0; i < nums.length; i++) {
6            if (i > 0 && nums[i] == nums[i - 1]) {
7                continue;
8            }
9            int j = i + 1;
10            int k = nums.length - 1;
11            while (j < k) {
12                int sum = nums[i] + nums[j] + nums[k];
13                if (sum == 0) {
14                    List<Integer> innerList = new ArrayList();
15                    innerList.add(nums[i]);
16                    innerList.add(nums[j]);
17                    innerList.add(nums[k]);
18                    results.add(innerList);
19
20                    while (j < k && nums[j] == nums[j + 1]) {
21                        j++;
22                    }
23                    while (j < k && nums[k - 1] == nums[k]) {
24                        k--;
25                    }
26                    j++;
27                    k--;
28                } else if (sum > 0) {
29                    k--;
30                } else {
31                    j++;
32                }
33            }
34        }
35        return results;
36    }
37}