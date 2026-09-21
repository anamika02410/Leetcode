class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<Integer>ll=new ArrayList<>();
         List<List<Integer>>ans=new ArrayList<>();
         combination(candidates,target,ll,0,ans);
         return ans;
    }
    public static void combination(int[]candidates,int target, List<Integer>ll,int idx,List<List<Integer>>ans){
        if(target==0){
            ans.add(new ArrayList<Integer>(ll));
            return;
        }
        for(int i=idx;i< candidates.length;i++){
            if (candidates[i] <= target) {
                ll.add(candidates[i]);
                combination(candidates,target-candidates[i],ll,i,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
    
}