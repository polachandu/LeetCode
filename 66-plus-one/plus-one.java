import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        BigInteger value = new BigInteger(sb.toString());
        BigInteger finalValue = value.add(BigInteger.ONE);
        String finalValueString = String.valueOf(finalValue);
        int[] result = new int[finalValueString.length()];
        for (int i = 0; i < finalValueString.length(); i++) {
            char ch = finalValueString.charAt(i);
            result[i] = Character.getNumericValue(ch);
        }
        return result;
    }
}