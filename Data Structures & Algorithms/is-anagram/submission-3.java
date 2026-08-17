class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> source = new HashMap<>();
        Map<Character, Integer> another = new HashMap<>();
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        for (char c : sc) {
            source.put(c, source.getOrDefault(c, 0) + 1);
        }
        for (char c : tc) {
            another.put(c, another.getOrDefault(c, 0) + 1);
        }
        if (source.size() == another.size()) {
            for (Character key : source.keySet()) {
                if (!source.get(key).equals(another.get(key))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
