// Last updated: 10/19/2026, 6:54:16 PM
1class Solution {
2    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
3        int result = 0;
4        Collections.sort(processorTime);
5        Collections.sort(tasks, Collections.reverseOrder());
6        for (int i = 0; i < processorTime.size(); i++) {
7            int finish = processorTime.get(i) + tasks.get(4 * i);
8            result = Math.max(result, finish);
9        }
10        return result;
11    }
12}