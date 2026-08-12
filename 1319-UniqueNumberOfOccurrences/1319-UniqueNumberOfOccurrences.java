// Last updated: 8/12/2026, 11:11:35 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num:map.values()){
            if(al.contains(num)){
                return false;
            }else{
            al.add(num);
            }
        }
        return true;
    }
}
