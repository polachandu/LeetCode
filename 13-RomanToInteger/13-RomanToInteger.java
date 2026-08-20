// Last updated: 8/20/2026, 4:17:00 PM
class Solution {
    public int romanToInt(String s) {
        int decimal =0;
        int i=0;
        while(i<s.length()){
            if(i+1 == s.length()){
                return decimal = decimal +getInt(s.charAt(i));
            }
            else if(s.charAt(i) == 'I' && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X')){
                decimal+= getInt(s.charAt(i+1))-1;
                i+=2;
            }
            else if(s.charAt(i)=='X' &&(s.charAt(i+1)=='L' || s.charAt(i+1)=='C')){
                decimal+=getInt(s.charAt(i+1))-10;
                i+=2;
            }
            else if(s.charAt(i)=='C' &&(s.charAt(i+1)=='D' || s.charAt(i+1)=='M')){
                decimal+=getInt(s.charAt(i+1))-100;
                i+=2;
            }
            else{
                decimal+= getInt(s.charAt(i));
                i++;
            }
        }
        return decimal;
    }
        public int getInt(char ch){
            switch(ch){
                case 'I': return 1;
                    case 'V': return 5;
                    case 'X': return 10;
                    case 'L': return 50;
                    case 'C': return 100;
                    case 'D': return 500;
                    case 'M': return 1000;
                    
                    
            }
            return 0;
        }
    }
