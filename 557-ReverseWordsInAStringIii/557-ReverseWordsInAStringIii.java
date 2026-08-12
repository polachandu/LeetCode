// Last updated: 8/12/2026, 11:14:09 AM
class Solution {
    public String reverseWords(String s) {
        int lastSpaceIndex = -1;
        char[] chArray = s.toCharArray();
        int len = s.length();
        for(int strIndex=0;strIndex<=len;strIndex++){
            if(strIndex == len || chArray[strIndex]==' '){
                int startIndex = lastSpaceIndex+1;
                int endIndex = strIndex - 1;
                while(startIndex < endIndex){
                    char temp = chArray[startIndex];
                    chArray[startIndex] = chArray[endIndex];
                    chArray[endIndex] = temp;
                    startIndex++;
                    endIndex--;
                }
                lastSpaceIndex = strIndex;
            }
            
        }
        return new String(chArray);
    }
}