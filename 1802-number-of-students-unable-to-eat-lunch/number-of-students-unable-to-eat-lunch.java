class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> deque = new ArrayDeque();
        for (int i = 0; i < students.length; i++) {
            deque.offerLast(students[i]);
        }
        int count = 0;
        int idx = 0;
        while (!deque.isEmpty()) {
            if (deque.peekFirst() == sandwiches[idx]) {
                deque.pollFirst();
                idx++;
                count = 0;
            } else {
                deque.offerLast(deque.pollFirst());
                count++;
            }
            if (count == deque.size()) {
                return count;
            }
        }
        return deque.size();
    }
}