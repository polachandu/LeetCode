// Last updated: 8/12/2026, 11:08:26 AM
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;
        for(int i=0;i<students.length;i++){
            moves +=Math.abs(seats[i]-students[i]);
        }
        return moves;
    }
}