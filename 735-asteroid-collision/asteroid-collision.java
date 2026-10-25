class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        return collision(asteroids);
    }
    public static int[] collision(int[]asteroids){
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int top=asteroids[i];
            boolean board=true;
            while(board==true && top<0 && !st.isEmpty() && st.peek()>0){
                if(st.peek()<-top){
                    st.pop();
                }
                else if(st.peek()==-top){
                    st.pop();
                    board=false;
                }
                else{
                    board=false;
                }
            }
            if(board==true){
                st.push(top);
            }
        }
        int[]ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}