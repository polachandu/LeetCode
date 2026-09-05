// Last updated: 9/5/2026, 12:29:53 PM
class Solution {
    public String interpret(String command) {
         String s1 = command;
	        String s2 = s1.replace("()", "o");
	        String s3 = s2.replace("(al)", "al");
	        return s3;
    }
}