class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        char board[][] = new char[n][n];
        nQueens(board, 0, n);

        return count;
    }

    public void nQueens(char board[][], int row, int n) {
        if(row == n) {
            count++;
            return;
        }

        for(int i=0; i<n; i++) {
            if(isSafe(board, row, i)) {
                board[row][i] = 'Q';
                nQueens(board, row+1, n);
                board[row][i] = '\u0000';
            }
        }

        return;
    }

    public boolean isSafe(char board[][], int row, int col) {
        for(int i=row, j=col; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        for(int i=row, j=col; i>=0 && j<board[row].length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        for(int i=row; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        return true;
    }
}