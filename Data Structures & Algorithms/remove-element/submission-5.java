class Solution {
    public int removeElement(int[] nums, int val) {
        int k= 0;
        int length = nums.length;
        while (k < length) {
            if (nums[k] == val) {
                nums[k] = nums[--length];
            } else {
            k++;
        }

    }
    return k;
}
}