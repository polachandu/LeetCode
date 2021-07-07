
public class RomanToInteger {

	public static void main(String[] args) {
		
		System.out.println(romanToInt("MCMXCIV"));

	}
	public static int romanToInt(String s) {
		int sum=0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='I') {
				sum+=1;
			}
			if(s.charAt(i)=='V') {
				sum+=5;
			}
			if(s.charAt(i)=='X') {
				sum+=10;
			}
			if(s.charAt(i)=='L') {
				sum+=50;
			}
			if(s.charAt(i)=='C') {
				sum+=100;
			}
			if(s.charAt(i)=='D') {
				sum+=500;
			}
			if(s.charAt(i)=='M') {
				sum+=1000;
			}
		}
			if(s.contains("IV")) {
				sum+=4;
			}
			if(s.contains("IX")) {
				sum+=9;
			}
			if(s.contains("XL")) {
				sum+=40;
			}
			if(s.contains("XC")) {
				sum+=90;
			}
			if(s.contains("CD")) {
				sum+=400;
			}
			if(s.contains("CM")) {
				sum+=900;
			}
			
		
		return sum;
	}
	

}
