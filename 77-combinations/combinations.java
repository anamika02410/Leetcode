class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        solve(n,k,list,ans,1);
        return ans;
    }
    public static void solve(int n,int k,List<Integer>list,List<List<Integer>>ans,int idx){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<=n;i++){
            list.add(i);
            solve(n,k,list,ans,i+1);
            list.remove(list.size()-1);
        }
    }
    }
    