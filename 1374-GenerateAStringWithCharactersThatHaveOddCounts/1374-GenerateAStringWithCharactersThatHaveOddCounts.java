// Last updated: 9/5/2026, 12:30:58 PM
class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
	        if(n%2 ==0 && n != 1) {
	        	for(int i=0;i<n-1;i++) {
	        		sb.append("a");
	        	}
	        	sb.append("b");
	        }else if(n%2 != 0 && n != 1) {
	        	for(int i=0;i<n-2;i++) {
	        		sb.append("a");
	        	}
	        	sb.append("bc");
	        }
        if(n ==1 ){
            sb.append("a");
        }
	        return sb.toString();
    }
}