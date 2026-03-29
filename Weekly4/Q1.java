class Solution {
    public int firstMatchingIndex(String s) {
        int n = 0;
        if(s.length() % 2 == 0) n = s.length() / 2;
        else n = s.length() / 2 + 1;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == s.charAt(s.length() - i - 1)) return i;
        }
        return -1;
    }
}©leetcode
