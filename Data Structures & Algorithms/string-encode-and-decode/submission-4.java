class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder("");
        for (String s : strs) {
            encoded.append(s.length()).append(",");
        }
        encoded.append(".");
        for (String str : strs) {
            encoded.append(str).append("#");
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        if (str.equals(".")) {
            return new ArrayList<>();
        }
        int stIdx = str.indexOf(".") + 1;
        List<String> result = new ArrayList<>();
        String[] lengths = str.substring(0, stIdx - 1).split(",");
        for (String len : lengths) {
            int l = stIdx + Integer.valueOf(len);
            result.add(str.substring(stIdx, l));
            stIdx = l == 0 ? l : l + 1;
        }
        return result;
    }
}
