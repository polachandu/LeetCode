class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        for(int i=1;i<intervals.length;i++){
            int meetingLasts = intervals[i-1][1];
            int meetingStarts = intervals[i][0];
            if(meetingLasts > meetingStarts){
                return false;
            }
        }
        return true;
    }
}