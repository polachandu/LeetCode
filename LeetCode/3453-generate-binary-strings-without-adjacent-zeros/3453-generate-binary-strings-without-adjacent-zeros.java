class Solution {
    static void func(int n,String str,List<String> arr,int last){
        if(n==0){
            arr.add(str);
            return;
        }
        func(n-1,str+"1",arr,1);
        if(last==1){
            func(n-1,str+"0",arr,0);
        }
    }
    public List<String> validStrings(int n) {
         List<String> arr=new ArrayList<>();
        func(n,"",arr,1);
        return arr;
    }
}