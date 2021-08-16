//You own a Goal Parser that can interpret a string command. 
//The command consists of an alphabet of "G", "()" and/or "(al)" in some order. 
//The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". 
//The interpreted strings are then concatenated in the original order.
//Given the string command, return the Goal Parser's interpretation of command.
//
//Example 1:
//Input: command = "G()(al)"
//Output: "Goal"
//Explanation: The Goal Parser interprets the command as follows:
//G -> G
//() -> o
//(al) -> al
//The final concatenated result is "Goal".

//Example 2:
//Input: command = "G()()()()(al)"
//Output: "Gooooal"

//Example 3:
//Input: command = "(al)G(al)()()G"
//Output: "alGalooG"
	
public class GoalParserInterpretation {
	
	
	public static String interpret(String command) {
	        String s1 = command;
	        String s2 = s1.replace("()", "o");
	        String s3 = s2.replace("(al)", "al");
	        return s3;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(interpret("G()(al)"));
		System.out.println(interpret("G()()()()(al)"));
		System.out.println(interpret("(al)G(al)()()G"));

	

	}

}
