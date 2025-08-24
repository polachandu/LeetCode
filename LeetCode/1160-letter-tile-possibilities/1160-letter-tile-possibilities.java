class Solution {
    public int numTilePossibilities(String tiles) {
        int len = tiles.length();
        Set<String> possibilites = new HashSet<>();
        boolean[] used = new boolean[len];
        backTrack("", tiles, used, possibilites);
        return possibilites.size()-1;
    }

    private void backTrack(String s,String tiles, boolean[] used, Set<String> possibilites){
        
        possibilites.add(s);

        for(int i=0;i< tiles.length();i++){
            if(!used[i]){
                used[i] = true;
                backTrack(s+tiles.charAt(i),tiles,used,possibilites);
                used[i] = false;
            }
        }
    }
}