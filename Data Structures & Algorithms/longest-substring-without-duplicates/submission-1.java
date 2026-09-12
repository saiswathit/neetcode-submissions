class Solution {
    public int lengthOfLongestSubstring(String s) {
                char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < arr.length; right++) {
            if (map.containsKey(arr[right])) {
                 left = Math.max(left, map.get(arr[right]) + 1);
            }
            map.put(arr[right], right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
