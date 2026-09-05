// Last updated: 9/5/2026, 12:31:42 PM
class Solution {
    public String defangIPaddr(String address) {
        String s1 = new String(address);
        String s2 = s1.replace(".","[.]");
        return s2;
    }
}