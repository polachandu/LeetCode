
public class PowerOfXN {
	public static double myPow(double x, int n) {
//        double ans = 1.0;
//        long temp_n = n;
//        if(temp_n<0) {
//        	temp_n*=-1;
//        }
//        while(temp_n>0) {
//        	if(temp_n%2 ==0) {
//        		temp_n = temp_n/2;
//        		x = x*x;
//        	}
//        	else {
//        		temp_n = temp_n-1;
//        		ans = ans*x;
//        	}
//        }
//        if(n<0) {
//        	ans = 1.0/ans;
//        }
//        return ans;
		
		
		
		
		
		if(n == 0) return 1;
        if(n < 0 && n > Integer.MIN_VALUE) {
            x = 1/x;
            n *= -1;
        }
        return x*myPow(x,n-1);
//		return Math.pow(x, n);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myPow(2,-2));
		
	}

}
