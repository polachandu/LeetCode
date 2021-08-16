//Given a valid (IPv4) IP address, return a defanged version of that IP address.
//A defanged IP address replaces every period "." with "[.]".
// 
//Example 1:
//Input: address = "1.1.1.1"
//Output: "1[.]1[.]1[.]1"

//Example 2:
//Input: address = "255.100.50.0"
//Output: "255[.]100[.]50[.]0"
public class DefangingAnIPAddress {
		
	
	public static String defangIPaddr(String address) {
        String s1 = new String(address);
        String s2 = s1.replace(".","[.]");
        return s2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(defangIPaddr("1.1.1.1"));
		System.out.println(defangIPaddr("255.100.50.0"));
	}

}
