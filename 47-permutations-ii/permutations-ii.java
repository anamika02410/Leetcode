class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
       List<List<Integer>>ans=new ArrayList<>();
       List<Integer>list=new ArrayList<>(); 
       boolean[]board=new boolean[nums.length];
       Arrays.sort(nums);
       solve(board,nums,list,ans);
       return ans;

    }
    public static void solve(boolean[]board,int[]nums,List<Integer>list, List<List<Integer>>ans){
        if(list.size()==nums.length){
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(board[i]==true){
                continue;
            }
            if(i>0 && nums[i]==nums[i-1] && !board[i-1]){
                continue;
            }
            board[i]=true;
                list.add(nums[i]);
                solve(board,nums,list,ans);
                list.remove(list.size()-1);
                board[i]=false; 
            }
        }
    }
