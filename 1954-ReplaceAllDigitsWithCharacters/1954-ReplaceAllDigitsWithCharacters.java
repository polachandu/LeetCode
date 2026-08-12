// Last updated: 8/12/2026, 11:08:54 AM
class Solution {
    public String replaceDigits(String s) {
        char[] res = new char[s.length()];
	        res = s.toCharArray();
	        for(int i=1;i<s.length();i+=2){
	            int number = ((char)res[i-1] );
	            String number1 = Character.toString(res[i]);
	            int number3 = Integer.parseInt(number1);
	            int number2 = number + number3;
	            res[i]= (char)number2;
	        }
	        return String.valueOf(res);
    }
}