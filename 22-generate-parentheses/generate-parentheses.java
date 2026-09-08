class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        parentheses(n,0,0,"",ans);
        return ans;
    }


         public static void parentheses(int n,int open,int close,String answer,List<String>ans){
        if(open==n && close==n){
            ans.add(answer);
            return;
        }
        if(open<n){
            parentheses(n,open+1,close,answer+"(",ans);
        }
        if(close<open){
            parentheses(n,open,close+1,answer+")",ans);
        }
    }
    }