class Solution {
    public void solve(char[][] board) {
       int row = board.length;
       int col = board[0].length;

       for(int i=0;i<col;i++){
        dfs(0,i,board);
        dfs(row-1, i, board);
       }
       for(int j=0;j<row;j++){
        dfs(j,0,board);
        dfs(j, col-1, board);
       }
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(board[i][j]=='O'){
                board[i][j]='X';
            }
            else if(board[i][j]=='#'){
                board[i][j]='O';
            }
        }
       } 
    }

    public void dfs(int r, int c, char[][]board){
      if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c]!='O'){
        return ; 
      }

      if(board[r][c]=='O'){
        board[r][c] = '#';
      }

      dfs(r-1, c, board);
      dfs(r+1, c, board);
      dfs(r, c-1, board);
      dfs(r, c+1, board);
    }
}
