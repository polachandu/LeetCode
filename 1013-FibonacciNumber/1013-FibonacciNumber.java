// Last updated: 8/12/2026, 11:12:14 AM
class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        else if(n > 2){
            return fib(n-1)+fib(n-2);
        }else{
            return 0;
        }
        
    }
}