// Last updated: 10/19/2026, 6:48:16 PM
1class Solution {
2    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
3        int result = 0;
4        Collections.sort(processorTime);
5        Collections.sort(tasks, Collections.reverseOrder());
6        for (int i = 0; i < tasks.size(); i++) {
7            result = Math.max(result, tasks.get(i) + processorTime.get(i / 4));
8        }
9        return result;
10    }
11}