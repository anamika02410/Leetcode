class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int si=0;
       int sum=0;
       int min=Integer.MAX_VALUE;
       for(int ei=0;ei<nums.length;ei++){
        sum=sum+nums[ei];
       while(sum>=target){
        int length=ei-si+1;
        min=Math.min(min,length);
        sum-=nums[si];
        si++;
       }
       }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
       
       return min;
    }
}