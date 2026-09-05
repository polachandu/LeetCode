// Last updated: 9/5/2026, 12:28:26 PM
class Solution {
    public int minimumOperations(int[] nums) {
         Set<Integer> set = new HashSet<>();
        for (int a: nums)
            if (a > 0)
                set.add(a);
        return set.size();
    }
}