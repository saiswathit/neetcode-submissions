class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> result = new HashMap<>();

        for (String str: strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortedS = new String(arr);
            result.putIfAbsent(sortedS,new ArrayList<>());
            result.get(sortedS).add(str);
        }

        return new ArrayList<>(result.values());
    }
}
