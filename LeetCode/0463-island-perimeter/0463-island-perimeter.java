class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int rows = grid.length;
        int cols = grid[0].length;

        int UP,DOWN,LEFT,RIGHT;
        int result =0;
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(grid[r][c] == 1){
                    if(r == 0) UP=0;
                    else UP=grid[r-1][c];
                    if(c==0) LEFT=0;
                    else LEFT=grid[r][c-1];
                    if(r==rows-1) DOWN=0;
                    else DOWN=grid[r+1][c];
                    if(c==cols-1) RIGHT=0;
                    else RIGHT=grid[r][c+1];
                result +=  4 - (UP+DOWN+LEFT+RIGHT);

                }
            }
        }
        return result;
    }
}