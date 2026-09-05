// Last updated: 9/5/2026, 12:29:34 PM
class Solution {
    public int countGoodRectangles(int[][] rectangles) {
         ArrayList al = new ArrayList();
	        for(int i=0;i<rectangles.length;i++) {
	        	al.add(Arrays.stream(rectangles[i]).min().getAsInt());
	        }
	        int[] squares = new int[al.size()];
	        for(int i=0;i<al.size();i++) {
	        	squares[i] = (int) al.get(i);
	        }
	       Arrays.sort(squares);
	       int count=0;
	       for(int i=0;i<squares.length;i++) {
	    	   if(squares[i] == squares[squares.length-1]) {
	    		   count++;
	    	   }
	       }
	       return count;
    }
}