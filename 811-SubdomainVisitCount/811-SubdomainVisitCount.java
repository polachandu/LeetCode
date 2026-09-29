// Last updated: 9/28/2026, 8:48:58 PM
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> domainMap = new HashMap();
        for (String cpdomain : cpdomains) {
            String[] splitCpDomain = cpdomain.split(" ");
            Integer cpDomainCount = Integer.parseInt(splitCpDomain[0]);
            String cpDomain = splitCpDomain[1];
            String[] parts = cpDomain.split("\\.");
            StringBuilder suffix = new StringBuilder();

            for (int i = parts.length - 1; i >= 0; i--) {
                if (suffix.length() > 0) {
                    suffix.insert(0, ".");
                }
                suffix.insert(0, parts[i]);
                domainMap.put(suffix.toString(), domainMap.getOrDefault(suffix.toString(), 0) + cpDomainCount);
            }
        }
        List<String> results = new ArrayList();
        for (Map.Entry<String, Integer> entryMap : domainMap.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(entryMap.getValue()).append(" ").append(entryMap.getKey());
            results.add(sb.toString());
        }
        return results;
    }
}