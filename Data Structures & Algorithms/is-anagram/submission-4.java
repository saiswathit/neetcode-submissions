class Solution {
    public boolean isAnagram(String s, String t) {
     char[] str1 = s.toCharArray();
     char[] str2 = t.toCharArray();
     
     Map<Character,Integer> count = new HashMap<>();

      for (char c: str1) {
        count.put(c, count.getOrDefault(c, 0) + 1);
      }

      for(char c: str2) {
        if(count.containsKey(c)) {
            count.put(c, count.get(c)-1);
            if(count.get(c) == 0) {
                count.remove(c);
            }
        } else {
            return false;
        }
      }

      return count.size() == 0;

    }
}
