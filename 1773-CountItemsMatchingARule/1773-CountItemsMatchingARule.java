// Last updated: 9/5/2026, 12:29:25 PM
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
    int comperatorIndex;

    if (ruleKey.equals("type")) {
        comperatorIndex = 0;
    } else if (ruleKey.equals("color")) {
        comperatorIndex = 1;
    } else {
        comperatorIndex = 2;
    }

    for (List<String> list : items) {
        if (list.get(comperatorIndex).equals(ruleValue)) {
            count++;
        }
    }

    return count;
    }
}