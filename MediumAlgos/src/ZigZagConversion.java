
public class ZigZagConversion {
	
	
public static void convert(String s, int numRows) {
	String s1 ="";
	for(int i=1;i<=numRows;i++) {
		if((i==1)&& i== numRows) {
			s1 += Character.toString((s.charAt(i+(2*(numRows)-3))));
		}
		System.out.println(s1);
	}
	
}
	

	
        
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convert("PAYPALISHIRING",3);
	}

}
