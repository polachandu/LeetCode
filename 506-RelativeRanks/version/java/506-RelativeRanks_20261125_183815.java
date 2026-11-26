// Last updated: 11/25/2026, 6:38:15 PM
1class Solution {
2    public String[] findRelativeRanks(int[] score) {
3        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
4        String[] result = new String[score.length];
5        for (int i = 0; i < score.length; i++) {
6            maxHeap.offer(new int[] { score[i], i });
7        }
8        int place = 1;
9        while (!maxHeap.isEmpty()) {
10            int[] curr = maxHeap.poll();
11            if (place == 1) {
12                result[curr[1]] = "Gold Medal";
13            } else if (place == 2) {
14                result[curr[1]] = "Silver Medal";
15            } else if (place == 3) {
16                result[curr[1]] = "Bronze Medal";
17            } else {
18                result[curr[1]] = String.valueOf(place);
19            }
20            place++;
21        }
22        return result;
23    }
24}