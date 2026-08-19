class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> lookup = new HashMap<>();
        for (String str : strs) {
            String key = getKey(str);
            lookup.computeIfAbsent(key, s -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(lookup.values());
    }

    private String getKey(String s) {
        int[] count = new int[26];
        char[] sChars = s.toCharArray();
        for (char c : sChars) {
            count[c-'a']++;
        }
        int i = 0;
        StringBuilder key = new StringBuilder();
        while (i < 26) {
            key.append('#').append(count[i]);
            i++;
        }
        return key.toString();
    }
}
