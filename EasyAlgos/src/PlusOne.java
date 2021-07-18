import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits1 = {1,2,3};
		System.out.println(Arrays.toString(plusOne(digits1)));
		
		int[] digits2 = {4,3,2,1};
		System.out.println(Arrays.toString(plusOne(digits2)));
		
		int[] digits3 = {0};
		System.out.println(Arrays.toString(plusOne(digits3)));

	}
	public static int[] plusOne(int[] digits) {
		for(int i=0;i<digits.length;i++) {
			if(i == digits.length-1) {
				digits[i] = digits[digits.length-1]+1;
			}
		}
        return digits;
    }

}
