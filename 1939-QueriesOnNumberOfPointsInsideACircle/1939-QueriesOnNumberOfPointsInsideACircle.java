// Last updated: 8/12/2026, 11:09:00 AM
class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] a = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int count =0;
            int x = queries[i][0];
            int y = queries[i][1];
            int radius = queries[i][2];
            for(int j=0;j<points.length;j++){
                int x1 = points[j][0];
                int y1 = points[j][1];
                if(((x-x1)*(x-x1) +(y-y1)*(y-y1))<=(radius*radius)){
                    count++;
                }
            }
            a[i] = count;
        }
        return a;
    }
    
}