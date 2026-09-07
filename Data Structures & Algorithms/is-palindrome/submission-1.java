class Solution {
    public boolean isPalindrome(String s) {
        char[] ch = s.toLowerCase().toCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = 0 ; i < ch.length ; i++) {
            char c =ch[i];
            if ((c >= '0' && c <= '9') ||
            (c >= 'a' && c <= 'z')) {
                str.append(c);
            }
        }
        String og = str.toString();
        return str.reverse().toString().equals(og);
    }
}
