class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        backTracking(answer, new StringBuilder(),0,0,n);
        return answer;
    }

    private void backTracking(List<String> answer, StringBuilder sb, int leftCount, int rightCount, int n){
        if(sb.length() == 2*n){
            answer.add(sb.toString());
            return;
        }
        if(leftCount < n){
            sb.append("(");
            backTracking(answer,sb,leftCount+1,rightCount,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(leftCount>rightCount){
            sb.append(")");
            backTracking(answer,sb,leftCount,rightCount+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}