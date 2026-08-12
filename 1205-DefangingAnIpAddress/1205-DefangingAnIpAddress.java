// Last updated: 8/12/2026, 11:11:43 AM
class Solution {
    public String defangIPaddr(String address) {
        String s1 = new String(address);
        String s2 = s1.replace(".","[.]");
        return s2;
    }
}