// Last updated: 9/5/2026, 12:30:47 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> al = new ArrayList<>();
        int max=0,sum =0, totalCandies=0;
        for(int i=0;i<candies.length;i++){
                totalCandies = candies[i]+extraCandies;
                max = Arrays.stream(candies).max().getAsInt();
                if(totalCandies >= max){
                    al.add(true);
                }else{
                    al.add(false);
                }
        }
        return al;
    }
}