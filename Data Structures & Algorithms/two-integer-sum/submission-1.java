class Solution {
    public int[] twoSum(int[] nums, int target) {
                    if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        Map<Integer, Integer> elementMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (elementMap.containsKey(diff)) {
                return new int[]{elementMap.get(diff), i};
            } 
                elementMap.put(nums[i], i);
            
        }
        
        return new int[]{};
    }
}
