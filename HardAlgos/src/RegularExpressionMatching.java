
public class RegularExpressionMatching {
	
	 public static void isMatch(String s, String p) {
	        if(s.length()>p.length()){
	            return;
	        }
	       
	        StringBuilder str = new StringBuilder(p);
	        for(int i=0;i<p.length();i++) {
	        	
	        	if(p.charAt(i)=='.') {
	        		Character a = s.charAt(i);
	        		 str.setCharAt(i,a);
	        		 
	        		
	        	}
	        	
	        	
	        	else if(p.charAt(i)=='*') {
	        		Character a = p.charAt(i-1);
	        		str.setCharAt(i, a);
	        		
	        		}
	        	}
	        System.out.println(str);
	 }
	        
	        
	 
	 
	 
	 
	 
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isMatch("mississippi","mis*is*p*.");
		isMatch("aab","c*a*b");
		isMatch("aa","a*");
		isMatch("ab",".*");
	}

}
