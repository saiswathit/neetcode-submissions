class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
      int[] arr = new int[26];
        char[] s1 = s.toCharArray();
        for (char c : s1) {
            arr[c - 'a']++;
        }
        
        char[] t1 = t.toCharArray();
        for(char c : t1) {
            if (arr[c - 'a'] == 0) {
                return false;
            }
            arr[c - 'a']--;
        }
        return true;
    }
}
