class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end=1;
        while(end<nums.length){
            if(nums[start]==nums[end]){
                return true;
            }
            start++;
            end++;
        }
        return false;
    }
}