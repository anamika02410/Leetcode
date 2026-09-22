class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
          List<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        solve(n,k,list,ans,1,0);
        return ans;
    }
     public static void solve(int n,int k,List<Integer>list,List<List<Integer>>ans,int idx,int sum){
        if(list.size()==k && sum==n){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<=9;i++){
            list.add(i);
            solve(n,k,list,ans,i+1,sum+i);
            list.remove(list.size()-1);
        }
    }
}