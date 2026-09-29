// Last updated: 9/28/2026, 8:51:02 PM
1class Solution {
2    public List<String> subdomainVisits(String[] cpdomains) {
3        Map<String, Integer> domainMap = new HashMap();
4        for (String cpdomain : cpdomains) {
5            String[] splitCpDomain = cpdomain.split(" ");
6            Integer cpDomainCount = Integer.parseInt(splitCpDomain[0]);
7            String cpDomain = splitCpDomain[1];
8            String[] parts = cpDomain.split("\\.");
9            StringBuilder suffix = new StringBuilder();
10
11            for (int i = parts.length - 1; i >= 0; i--) {
12                if (suffix.length() > 0) {
13                    suffix.insert(0, ".");
14                }
15                suffix.insert(0, parts[i]);
16                domainMap.put(suffix.toString(), domainMap.getOrDefault(suffix.toString(), 0) + cpDomainCount);
17            }
18        }
19        List<String> results = new ArrayList();
20        for (Map.Entry<String, Integer> entryMap : domainMap.entrySet()) {
21            StringBuilder sb = new StringBuilder();
22            sb.append(entryMap.getValue()).append(" ").append(entryMap.getKey());
23            results.add(sb.toString());
24        }
25        return results;
26    }
27}