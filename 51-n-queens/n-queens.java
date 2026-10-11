class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        queen(ans,n,0,board);
        return ans;

    }
    public static void queen(List<List<String>>ans,int n,int row,char[][]board){
        if(row==n){
            List<String>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(new String(board[i]));
            }
            ans.add(list);
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isItSafe(board,row,col)){
                board[row][col]='Q';
                queen(ans,n,row+1,board);
                board[row][col]='.';
            }
        }
    }
    public static boolean isItSafe(char[][]board,int row,int col){
        int r=row;
        while(r>=0){
            if(board[r][col]=='Q'){
                return false;
            }
            r--;
        }
        r=row-1;
        int c=col-1;
        while(r>=0 && c>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
        }
        r=row-1;
        c=col+1;
        while(r>=0 && c<board.length){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
    
}
