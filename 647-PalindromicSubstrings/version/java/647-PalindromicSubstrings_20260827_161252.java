// Last updated: 8/27/2026, 4:12:52 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> results = new ArrayList();
4        backTrack(candidates, target, results, new ArrayList(), 0, 0);
5        return results;
6    }
7
8    private void backTrack(int[] candidates, int target, List<List<Integer>> results, List<Integer> current,
9            int index, int sum) {
10        if (sum == target) {
11            results.add(new ArrayList(current));
12        }
13        if (sum > target) {
14            return;
15        }
16        if (index > candidates.length) {
17            return;
18        }
19        for (int i = index; i < candidates.length; i++) {
20            current.add(candidates[i]);
21            backTrack(candidates, target, results, current, i, sum + candidates[i]);
22            current.remove(current.size() - 1);
23        }
24    }
25}