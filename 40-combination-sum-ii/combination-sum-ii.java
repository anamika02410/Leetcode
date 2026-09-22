class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(candidates);
          combination(candidates,target,list,0,ans);
          return ans;
    }
    public static void combination(int[]candidates,int target,List<Integer>list,int idx,List<List<Integer>>ans){
        if(target==0){
           ans.add(new ArrayList<Integer>(list));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if (i>idx && candidates[i]==candidates[i-1]) {
                continue;
            }
                list.add(candidates[i]);
                combination(candidates,target-candidates[i],list,i+1,ans);
               list.remove(list.size()-1);

            }
        }
}