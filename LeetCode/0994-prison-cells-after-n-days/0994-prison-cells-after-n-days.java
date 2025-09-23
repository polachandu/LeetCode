class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        n = (n-1)%14+1;
        for(int i=0;i<n;i++){
            cells= nextDayCells(cells);
        }
    return cells;
    }

    private int[] nextDayCells(int[] cells){
        int[] next = new int[cells.length];
        for(int i=1;i<7;i++){
            next[i] = cells[i-1] == cells[i+1] ? 1:0;
        }
        return next;
    }
}