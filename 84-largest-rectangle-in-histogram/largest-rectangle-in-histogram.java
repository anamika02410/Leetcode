class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>st=new Stack<>();
        int ans=0;
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty()&& heights[i]<heights[st.peek()]){
                int idx=st.pop();
                int rs=i;
                int ls=-1;
                if(!st.isEmpty()){
                    ls=st.peek();
                }
                int w=rs-ls-1;
                int h=heights[idx];
                int area=w*h;
                ans=Math.max(ans,area);
            }
            st.push(i);
        }
         while(!st.isEmpty()){
                int idx=st.pop();
                int h=heights[idx];
                int ls=st.isEmpty()?-1:st.peek();
                int w=heights.length-ls-1;
                 int area=w*h;
                ans=Math.max(ans,area);
            }
       return ans;
    }
}