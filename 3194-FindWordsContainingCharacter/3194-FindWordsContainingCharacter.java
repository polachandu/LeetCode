// Last updated: 8/12/2026, 11:07:37 AM
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