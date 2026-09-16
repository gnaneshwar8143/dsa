class Solution {
    public int thirdMax(int[] nums) {

        long max = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max2 && nums[i] != max) {
                max2 = nums[i];
            }
        }

        if(max2 == Long.MIN_VALUE) {
            return (int)max;
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max3 &&
               nums[i] != max &&
               nums[i] != max2) {
                max3 = nums[i];
            }
        }

        if(max3 == Long.MIN_VALUE) {
            return (int)max;
        }

        return (int)max3;
    }
}