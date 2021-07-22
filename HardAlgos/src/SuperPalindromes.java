import java.util.ArrayList;

public class SuperPalindromes {
	
public static int superpalindromesInRange(String left, String right) {
	ArrayList<Long> al = new ArrayList<>();
	long m=0;
	long y=0;
	long p=0;
	long reverseNumber =0;
	long reverseNumber1 =0;
	int counter =0;
        long a = Long.parseLong(left);
        long b = Long.parseLong(right);
        for(long i=a;i<=b;i++) {
        	for(long j=1; (j*j)<= i;j++  ) {
        		if(j*j == i) {
        			al.add(j*j);	
        			}
        		}
        	}
        for(int k=0;k<al.size();k++) {
        	m = (long) al.get(k);
        	//System.out.println("m: "+m);
        	y =m;
        	reverseNumber = 0;
        	while(y>0) {
        		
        		reverseNumber = reverseNumber*10 + (y%10);
        		y = y/10;
        	}
        	//System.out.println("reverseNumber: "+reverseNumber);
        	long l = (long) Math.sqrt(m);
        	//System.out.println("l: "+l);
        	p =l;
        	reverseNumber1=0;
        	while(p>0) {
        		reverseNumber1 = reverseNumber1*10 +(p%10);
        		p = p/10;
        	}
        	//System.out.println("reverseNumber1: "+reverseNumber1);
        	if((reverseNumber == m) && (reverseNumber1 == l)) {
        		counter++;
        		
        	}
        }
        return counter;
        }
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(superpalindromesInRange("4","1000"));
		System.out.println(superpalindromesInRange("1","2"));
		System.out.println(superpalindromesInRange("40000000000000000","50000000000000000"));
		
	}

}
