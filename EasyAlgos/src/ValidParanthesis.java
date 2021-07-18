//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
// 
//
//Example 1:
//Input: s = "()"
//Output: true

//Example 2:
//Input: s = "()[]{}"
//Output: true

//Example 3:
//Input: s = "(]"
//Output: false

//Example 4:
//Input: s = "([)]"
//Output: false

//Example 5:
//Input: s = "{[]}"
//Output: true




import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("()"));
		System.out.println("-----");
		System.out.println(isValid("()[]{}"));
		System.out.println("-----");
		System.out.println(isValid("(]"));
		System.out.println("-----");
		System.out.println(isValid("([)]"));
		System.out.println("-----");
		System.out.println(isValid("{[]}"));
		System.out.println("-----");

	}
//	  public static void isValid(String s) {
//	        if(s.length() %2 != 0){
//	            System.out.println("false");;
//	        }else{
//	        	int count = s.length();
//	        	for(int i = 0;i<count;i+=2) {
//	        		if(s.charAt(i)== '[') {
//	        			for(int j=i+1;j<count;j+=2) {
//	        				if(s.charAt(j)==']') {
//	        					count=count-2;
//	        					
//	        					break;
//	        				}
//	        				
//	        			}
//	        			
//	        		}
//	        		if(s.charAt(i)=='{') {
//	        			for(int j=i+1;j<count;j+=2) {
//	        				if(s.charAt(j)=='}') {
//	        					count=count-2;
//	        					break;
//	        				}
//	        				
//	        			}
//	        			
//	        		}
//	        		if(s.charAt(i)=='(') {
//	        			for(int j=i+1;j<count;j+=2) {
//	        				if(s.charAt(j)==')') {
//	        					count=count-2;
//	        					break;
//	        				}
//	        				
//	        			}
//	        			
//	        	}
//	        		System.out.println(count);
//	        }
//	        	if(count ==0) {
//	        		System.out.println("true");
//	        		
//	        	}
//			
//	        }
//	  }
	
	
//1)	Create a stack
//2)	Traverse in the string
//	a)if it is a starting bracker push it in stack
//	b)check if the stack is empty or not, just to verify that the first character is not the closing brakcet
//	c)if it is a close bracket, pop it and match it against the starting brackets, if it does not match then return false
//3)	Finally after traversal if the stack is empty, return true
	
	public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            
            else if (stack.isEmpty())
                return false;
            
            else if (ch == ')' && stack.pop() != '(')
                return false;
            
            else if (ch == ']' && stack.pop() != '[')
                return false;
            
            else if (ch == '}' && stack.pop() != '{')
                return false;
        }
        
        return stack.isEmpty();
        
    }
}
	    
	


