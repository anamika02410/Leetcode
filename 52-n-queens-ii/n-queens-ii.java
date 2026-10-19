class Solution {
    public int totalNQueens(int n) {
        boolean[][]board=new boolean[n][n];
          return queen(board,n,0);
        
       
    }
    public static int queen (boolean[][]board,int n,int row){
        if(n==0){
           return 1; 
        }
        int count=0;
        for(int col=0;col<board[0].length;col++){
            if(isitSafe(board,row,col)){
                board[row][col]=true;
               count+=queen(board,n-1,row+1);
                board[row][col]=false;
            }
        }  
        return count;
    }
    public static boolean isitSafe(boolean[][]board,int row,int col){
        int r=row;
        while(r>=0){
            if(board[r][col]==true){
                return false;
            }
            r--;
        }
        r=row-1;
        int c=col-1;
        while(r>=0 && c>=0){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c--;
        }
        r=row-1;
        c=col+1;
        while(r>=0 && c<board.length){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c++;
        }
        return true;
    
    }
    
}

