class Solution {
    public int[] topKFrequent(int[] nums, int k) {
                     
         List<Integer>[] freq = new List[nums.length + 1];
        Map<Integer, Integer> elementMap = new HashMap<>();
        for (int num : nums) {
            elementMap.put(num, elementMap.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : elementMap.entrySet()) {
                freq[entry.getValue()].add(entry.getKey());
            }
         
        int[] result = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int f : freq[i]) {
                result[index++] = f;
            }
        }
        
        return result;
}
}
