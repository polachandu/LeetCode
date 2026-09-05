// Last updated: 9/5/2026, 12:27:58 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(String.valueOf(x))){
                al.add(i);
            }
        }
        return al;
    }
}