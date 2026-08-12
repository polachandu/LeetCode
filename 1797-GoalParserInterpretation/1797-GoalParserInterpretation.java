// Last updated: 8/12/2026, 11:09:40 AM
class Solution {
    public String interpret(String command) {
         String s1 = command;
	        String s2 = s1.replace("()", "o");
	        String s3 = s2.replace("(al)", "al");
	        return s3;
    }
}