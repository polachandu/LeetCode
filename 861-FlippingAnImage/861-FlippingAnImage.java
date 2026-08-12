// Last updated: 8/12/2026, 11:12:58 AM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][image.length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                res[i][j] = image[i][image[j].length-j-1];
            }
        }
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res.length;j++){
                if(res[i][j] == 0){
                    res[i][j] = 1;
                }
                else{
                    res[i][j] = 0;
                }
            }
        }
        System.gc();
        return res;
    }
}