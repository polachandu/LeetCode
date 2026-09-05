// Last updated: 9/5/2026, 12:28:44 PM
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