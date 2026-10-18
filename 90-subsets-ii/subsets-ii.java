class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        solve(0,nums,list,ans);
        return ans;
    }
    public static void solve(int idx,int[]nums, List<Integer>list, List<List<Integer>>ans){
        ans.add(new ArrayList<Integer>(list));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
            
            list.add(nums[i]);
            solve(i+1,nums,list,ans);
            list.remove(list.size()-1);
        }
    }
}