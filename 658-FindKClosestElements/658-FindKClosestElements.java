// Last updated: 8/12/2026, 11:13:43 AM
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList();
        for(int num:arr){
            result.add(num);
        }
        Collections.sort(result,(num1,num2) -> Math.abs(num1-x)-Math.abs(num2-x));

        result = result.subList(0,k);

        Collections.sort(result);
        return result;
    }
}