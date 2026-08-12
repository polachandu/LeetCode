// Last updated: 8/12/2026, 11:14:32 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int contentChildren = 0;
        int cookieIndex = 0;
        while(cookieIndex < s.length && contentChildren < g.length){
            if(s[cookieIndex] >= g[contentChildren]){
                contentChildren++;
            }
            cookieIndex++;
        }
        return contentChildren;
    }
}