// Last updated: 9/5/2026, 12:29:46 PM
class Solution {
    public int minPartitions(String n) {
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
}