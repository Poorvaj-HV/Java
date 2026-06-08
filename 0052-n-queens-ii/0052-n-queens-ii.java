class Solution {
    int count = 0;

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        placeQueens(board, 0, n);

        return count;
    }

    public void placeQueens(char[][] board, int row, int n) {
        if(row >= n) {
            count++;
            return;
        }

        for(int i=0; i<n; i++) {
            if(isSafe(board, row, i)) {
                board[row][i] = 'Q';
                placeQueens(board, row+1, n);
                board[row][i] = '\u0000';
            }
        }

        return;
    }

    public boolean isSafe(char[][] board, int row, int col) {
        //checking for left diagonal - both row and col changes
        for(int i=row, j=col; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        //checking for right diagonal - both row and col changes
        for(int i=row, j=col; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        //checking for vertical - row changes, col constant
        for(int i=row; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        return true;
    }
}