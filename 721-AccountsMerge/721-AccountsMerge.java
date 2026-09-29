// Last updated: 9/28/2026, 8:49:41 PM
class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, String> parent = new HashMap();
        Map<String, String> emailToName = new HashMap();
        for (List<String> account : accounts) {
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                parent.putIfAbsent(email, email);
                emailToName.put(email, name);
            }
        }

        for (List<String> account : accounts) {
            String firstEmail = account.get(1);
            for (int i = 2; i < account.size(); i++) {
                union(parent, firstEmail, account.get(i));
            }
        }

        Map<String, List<String>> groups = new HashMap();
        for (String email : parent.keySet()) {
            String parentGroup = find(parent, email);
            groups.putIfAbsent(parentGroup, new ArrayList());
            groups.get(parentGroup).add(email);
        }

        List<List<String>> results = new ArrayList();
        for (String root : groups.keySet()) {
            List<String> emails = groups.get(root);
            Collections.sort(emails);
            emails.add(0, emailToName.get(root));
            results.add(emails);
        }
        return results;
    }

    private String find(Map<String, String> parent, String x) {
        if (!parent.get(x).equals(x)) {
            parent.put(x, find(parent, parent.get(x)));
        }
        return parent.get(x);
    }

    private void union(Map<String, String> parent, String x, String y) {
        String rootX = find(parent, x);
        String rootY = find(parent, y);
        if (!rootX.equals(rootY)) {
            parent.put(rootX, rootY);
        }
    }
}