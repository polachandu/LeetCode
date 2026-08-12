// Last updated: 8/12/2026, 11:08:24 AM
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Deque<int[]> deque = new ArrayDeque();
        for (int i = 0; i < tickets.length; i++) {
            deque.offerLast(new int[] { i, tickets[i] });
        }
        int time = 0;
        while (!deque.isEmpty()) {
            int[] front = deque.pollFirst();
            front[1]--;
            time++;
            if (front[0] == k && front[1] == 0) {
                return time;
            }
            if (front[1] > 0) {
                deque.offerLast(front);
            }
        }
        return time;
    }
}