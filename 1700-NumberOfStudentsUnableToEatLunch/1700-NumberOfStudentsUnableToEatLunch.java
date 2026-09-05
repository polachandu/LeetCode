// Last updated: 9/5/2026, 12:29:48 PM
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList();
        for (int i = 0; i < students.length; i++) {
            queue.offer(students[i]);
        }
        int count = 0;
        int idx = 0;
        while (!queue.isEmpty()) {
            if (queue.peek() == sandwiches[idx]) {
                queue.poll();
                idx++;
                count = 0;
            } else {
                queue.offer(queue.poll());
                count++;
            }
            if (count == queue.size()) {
                return count;
            }
        }
        return queue.size();
    }
}