import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	
public static boolean isHappy(int n) {
	
	        int a=0;    
		String s = Integer.toString(n);
		for(int i=0;i<s.length();i++) {
			int y = (Character.getNumericValue(s.charAt(i)) * (Character.getNumericValue(s.charAt(i))));
				a +=  y ;
				
		}
		System.out.println(a);

				if(a !=1) {
					isHappy(a);
					
					
				
		}
			return true;
		
		
}



	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(19));
		System.out.println(isHappy(7));
		System.out.println(isHappy(20));
		
	}
	

}
