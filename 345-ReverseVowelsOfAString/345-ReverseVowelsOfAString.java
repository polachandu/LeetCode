// Last updated: 8/12/2026, 11:15:13 AM
class Solution {
    public String reverseVowels(String s) {
        int start=0;
        int end = s.length()-1;
        char[] sChar = s.toCharArray();
        while(start < end){
            while(start < s.length() && !isVowel(sChar[start])){
                start++;
            }
            while(end >=0 && !isVowel(sChar[end])){
                end--;
            }
            if(start < end){
                swap(sChar, start++,end--);
            }
        }

        return new String(sChar);
    }
        public boolean isVowel(char vowel){
            if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' || vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U' ){
                return true;
            }else{
                return false;
            }
        }

    public void swap(char[] chars, int x, int y){
        char temp = chars[x];
        chars[x] = chars[y];
        chars[y] = temp;
    }
}