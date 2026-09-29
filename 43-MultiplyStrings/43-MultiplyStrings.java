// Last updated: 9/28/2026, 8:52:43 PM
class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] result = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int n1 = num1.charAt(i) - '0';
                int n2 = num2.charAt(j) - '0';
                int product = n1 * n2;
                int pos1 = i + j, pos2 = i + j + 1;
                int sum = product + result[pos2];

                result[pos2] = sum % 10;
                result[pos1] += sum / 10;
            }
        }
        StringBuilder resultBuilder = new StringBuilder();
        for (int res : result) {
            if (!(resultBuilder.length() == 0 && res == 0)) {
                resultBuilder.append(res);
            }
        }
        return resultBuilder.length() == 0 ? "0" : resultBuilder.toString();
    }
}