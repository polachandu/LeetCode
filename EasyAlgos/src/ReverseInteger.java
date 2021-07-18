//Given a signed 32-bit integer x, return x with its digits reversed. 

//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

//Example 1:
//Input: x = 123
//Output: 321

//Example 2:
//Input: x = -123
//Output: -321

//Example 3:
//Input: x = 120
//Output: 21

//Example 4:
//Input: x = 0
//Output: 0



public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(123));
		System.out.println("----");
		System.out.println(reverse(120));
		System.out.println("----");
		System.out.println(reverse(-321));
		System.out.println("----");
		System.out.println(reverse(0));
		System.out.println("----");

	}
	public static int reverse(int x) {
		String newNumber = "";
		if(x>=0) {
			int lastDigit=0;
			int reverseNumber = 0;
			while(x>0) {
				lastDigit = x%10;
				reverseNumber = (reverseNumber*10)+lastDigit;
				x = x/10;
			}
			//System.out.println(reverseNumber);
			String number = Integer.toString(reverseNumber);
			if(number.indexOf(0)==0) {
				for(int i =1;i<number.length();i++) {
					newNumber += number.indexOf(i); 
				}
			}else {
				newNumber = number;
			}
			return Integer.parseInt(newNumber);
		}
		
	
	if(x<0) {
		String newNumber1 = "";
		int y = -1*x;
		//System.out.println(y);
		int lastDigit1=0;
		int reverseNumber1 =0;
		while(y>0) {
			lastDigit1 = y%10;
			reverseNumber1 = (reverseNumber1*10)+lastDigit1;
			y = y/10;
			
		}
		String number1 = Integer.toString(reverseNumber1);
		if(number1.indexOf(0)==0) {
			for(int i =1;i<number1.length();i++) {
				newNumber += number1.indexOf(i); 
			}
		}else {
			newNumber1 = number1;
		}
		return -1*Integer.parseInt(newNumber1);
			
		}
		
		
	
	
	
	return 0;
	}
}
	


