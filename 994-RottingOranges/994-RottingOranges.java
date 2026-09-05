// Last updated: 9/5/2026, 12:32:02 PM
class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return -1;
        }

        int rows = grid.length, columns = grid[0].length;
        int[][] time = new int[rows][columns];
        for(int i=0;i<rows;i++){
            Arrays.fill(time[i],Integer.MAX_VALUE);
        }
        for(int i=0;i<rows;i++){
            for(int j =0;j<columns;j++){
                int value = grid[i][j];
                if(grid[i][j] == 2){
                    dfs(grid,time, i,j,0);
                }
            }
        }
        int timeRequired = 0;
        for(int i=0;i<rows;i++){
            for(int j =0;j<columns;j++){
                if(grid[i][j] == 1){
                   if(time[i][j] == Integer.MAX_VALUE) return -1;
                   timeRequired = Math.max(timeRequired, time[i][j]);
                }
            }
        }
        return timeRequired;
    }
    public void dfs(int[][] grid,int[][] time, int start, int end,int currentTime){
        if(start< 0 || end <0 || start>=grid.length || end >= grid[0].length || grid[start][end] == 0 || currentTime >= time[start][end]){
            return;
        }
        int replaceableValue = time[start][end];
        time[start][end] = currentTime;
        dfs(grid, time, start+1, end, currentTime+1);
        dfs(grid, time, start-1, end, currentTime+1);
        dfs(grid, time, start, end+1, currentTime+1);
        dfs(grid, time, start, end-1, currentTime+1);

            }
}