
public class StringToInteger {
	 public static int myAtoi(String s) {
		 String a ="";
		 int num1=0;
		 String b="";
		 String c="";
		 int num3=0;
		 String y=s.trim();
		 
	       int num = Integer.parseInt(y);
	        //for(int i=0;i<s.length();i++) {
	        	if(num>=0) {
	        		for(int j=0;j<y.length();j++) {
	        			if((s.charAt(j)>65 && s.charAt(j)<90) || (s.charAt(j)>97 && s.charAt(j)<122)) {
	        				break;
	        			}else {
	        				a += s.charAt(j);
	        			}
	        		}
	        		num1 = Integer.parseInt(a);
	        		return num1;
	        	}else {
	        		for(int j=0;j<y.length();j++) {
	        			if((s.charAt(j)>65 && s.charAt(j)<90) || (s.charAt(j)>97 && s.charAt(j)<122)) {
	        				break;
	        			}else {
	        				b += s.charAt(j);
	        			}
	        		}
	        		int num2 = Integer.parseInt(b);
	        		return num2;
//	        	}else {
//	        		
//					for(int j=0;i<s.length();i++) {
//	        			if((s.charAt(j)>65 && s.charAt(j)<90) || (s.charAt(j)>97 && s.charAt(j)<122)) {
//	        				break;
//	        			}else {
//	        				c += s.charAt(j);
//	        			}
//	        		}
//	        		num3 = Integer.parseInt(c);
//	        		return num3;
//	        	}
	        }
		 //return num;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("42"));
		System.out.println(myAtoi("   -42"));
		
	}

}
