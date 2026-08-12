// Last updated: 8/12/2026, 11:08:28 AM
class Solution {
    public String reversePrefix(String word, char ch) {
        char[] result = word.toCharArray();
        int left=0;
        for(int right = 0;right<word.length();right++){
            if(result[right] == ch){
                while(left <= right){
                    swap(result,left,right);
                    left++;
                    right--;
                }
                return new String(result);
            }
        }
        return word;
    }

    private void swap(char[] charachters, int index1, int index2){
        char temp = charachters[index1];
        charachters[index1] = charachters[index2];
        charachters[index2] = temp;
    }
}