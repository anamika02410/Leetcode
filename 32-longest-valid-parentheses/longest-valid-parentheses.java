class Solution {
    public int longestValidParentheses(String s) {
        return solve(s);
    }
    public static int solve(String s){
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(i);
            }
            else{
                st.pop();
            }
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    max=Math.max(max,i-st.peek());
                }
        }
       return max;

    }
}