class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        Set<String> set = new HashSet();
        boolean seen = false;
        int len = 0;
        for(int i=0;i<n;i++){
            int[] next = nextDayCells(cells);
            String key = Arrays.toString(next);
            if(set.contains(key)){
                seen = true;
                break;
            }
            set.add(key);
            len++;
            cells = next;
        }
        if(seen){
            return prisonAfterNDays(cells,n%len);
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