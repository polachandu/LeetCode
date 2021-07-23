//A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros.
//For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
//
//Given a string n that represents a positive decimal integer, return the minimum number of positive deci-binary numbers needed so that they sum up to n. 
//
//Example 1:
//Input: n = "32"
//Output: 3
//Explanation: 10 + 11 + 11 = 32

//Example 2:
//Input: n = "82734"
//Output: 8

//Example 3:
//Input: n = "27346209830709182346"
//Output: 9

import java.util.Arrays;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
	
	public static int minPartitions(String n) {
		int max = -1; 
		char[] ch = new char[n.length()];
		for(int i=0;i<n.length();i++) {
			ch[i] = n.charAt(i);
		}
		//System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++) {
			if(Character.getNumericValue(ch[i])>max) {
				max = Character.getNumericValue(ch[i]);
			
			}
		}
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minPartitions("32"));
		System.out.println(minPartitions("27346209830709182346")); 
		System.out.println(minPartitions("82734"));
	}

}
