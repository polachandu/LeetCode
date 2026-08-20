// Last updated: 8/20/2026, 3:19:37 PM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int fast = nums[0];
4        int slow = nums[0];
5        do {
6            fast = nums[nums[fast]];
7            slow = nums[slow];
8        } while (slow != fast);
9
10        slow = nums[0];
11        while (slow != fast) {
12            slow = nums[slow];
13            fast = nums[fast];
14        }
15        return slow;
16    }
17}