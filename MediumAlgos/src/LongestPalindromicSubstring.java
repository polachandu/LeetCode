
public class LongestPalindromicSubstring {

	
	public static String longestPalindrome(String s) {
        int n = s.length();
        if(n==1) {
        	return s;
        }else if(n==2) {
        	if(s.charAt(0) != s.charAt(1)) {
        		char f = s.charAt(0);
        		return Character.toString(f);
        	}else {
        		return s;
        	}
        }
        int i;
        String a = "";
        
        int j=0;
        outerloop:
        for(i=0;i<n;i++) {
        	
        	for(j=n-1;j>=0;j--) {
        		if(s.charAt(i) ==s.charAt(j) && i < j) {
        			a = s.substring(i, j+1); 
        			for(int k=0;k<=a.length();k++) {
        				for(int l=a.length()-1;l>=0;l--) {
        				if(a.charAt(k) == a.charAt(l) {
        					m = a.substring(k, )
        				}
        			}
        			}
        			
        		}
        		
        		
        	}
        	
        }
      
        return a;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("babad"));        
		System.out.println(longestPalindrome("cbbd"));		   
		System.out.println(longestPalindrome("ac"));
		System.out.println(longestPalindrome("a"));
		System.out.println(longestPalindrome("ccc"));


		
	}

}
