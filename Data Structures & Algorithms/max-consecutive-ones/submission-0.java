class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int length = nums.length;
        int currsum = 0;
        for (int i=0; i< length;i++ ) {
            if(nums[i] == 1)
            { 
                currsum++;
                max = Math.max(currsum,max);
            }
            else if(nums[i] == 0) {
               currsum = 0;
            }
        }

        return max;
    }
}