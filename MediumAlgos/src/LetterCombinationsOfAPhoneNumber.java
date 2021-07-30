import java.util.ArrayList;
import java.util.List;


public class LetterCombinationsOfAPhoneNumber {
	 public static List<String> letterCombinations(String digits) {
	        
	    String str="";
	ArrayList<String> list1 = new ArrayList<>();
	ArrayList<String> list2 = new ArrayList<>();
	for(int i=0;i<digits.length();i++) {
		char ch = digits.charAt(i);
		if(ch == '2') {
			list1.add("a");
			list1.add("b");
			list1.add("c");
			
		}
		else if(ch == '3') {
			list1.add("d");
			list1.add("e");
			list1.add("f");
			
		}
		else if(ch == '4') {
			list1.add("g");
			list1.add("h");
			list1.add("i");
			
		}
		else if(ch == '5') {
			list1.add("j");
			list1.add("k");
			list1.add("l");
			
		}
		else if(ch == '6') {
			list1.add("m");
			list1.add("n");
			list1.add("o");
			
		}
		else if(ch == '7') {
			list1.add("p");
			list1.add("q");
			list1.add("r");
			list1.add("s");
			
		}
		else if(ch == '8') {
			list1.add("t");
			list1.add("u");
			list1.add("v");
			
		}
		else if(ch == '9') {
			list1.add("w");
			list1.add("x");
			list1.add("y");
			list1.add("z");
			
		}
		
	}
	int k = list1.size();
	System.out.println(list1);
	
	if(digits.length()==2 && k%2 ==0) {
	for(int i=0;i<k/2;i++) {
		for(int j=k/2;j<=k-1;j++) {
			String a = list1.get(i);
			String b = list1.get(j);
			str = new StringBuilder().append(a).append(b).toString();
			list2.add(str);
		}
	}
	}else if(digits.length()==2 && k%2 != 0 ){
		for(int i=0;i<4;i++) {
			for(int j=4;j<=k-1;j++) {
				String a = list1.get(i);
				String b = list1.get(j);
				str = new StringBuilder().append(a).append(b).toString();
				list2.add(str);
	}
	
		}
	}
	if(digits.length()==2) {
		return list2;
	 }else {
		 return list1;
	 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterCombinations("78"));
	}

}
