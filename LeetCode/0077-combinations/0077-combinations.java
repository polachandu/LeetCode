class Solution {

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> comb = new ArrayList<>();
        backtrack(comb, new ArrayList<>(), n, k, 1);

        return comb;
    }

    public void backtrack(List<List<Integer>> comb, List<Integer> list, int range, int combinations, int index) {

        if (list.size() == combinations) {
            comb.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i <= range; i++) {

            list.add(i);
            backtrack(comb, list, range, combinations, i + 1);
            list.remove(list.size() - 1);
        }
    }
}