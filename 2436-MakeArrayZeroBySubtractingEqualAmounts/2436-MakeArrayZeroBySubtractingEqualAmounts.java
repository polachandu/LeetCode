// Last updated: 8/12/2026, 11:08:09 AM
class Solution {
    public int minimumOperations(int[] nums) {
         Set<Integer> set = new HashSet<>();
        for (int a: nums)
            if (a > 0)
                set.add(a);
        return set.size();
    }
}