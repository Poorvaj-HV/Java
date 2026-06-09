class Solution {
    List<List<String>> nQueens = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        // nQueens = new ArrayList<>();

        char[][] board = new char[n][n];
        for(int i=0; i<n; i++) {
            Arrays.fill(board[i], '.');
        }

        placeQueens(board, 0, n);
        return nQueens;
    }

    public void placeQueens(char[][] board, int row, int n) {
        if(row == n) {
            nQueens.add(construct(board));
            return;
        }

        for(int i=0; i<n; i++) {
            if(isSafe(board, row, i, n)) {
                board[row][i] = 'Q';
                placeQueens(board, row+1, n);
                board[row][i] = '.';
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col, int n) {
        //check left diagonal 
        for(int i=row, j=col; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        //check right diagonal
        for(int i=row, j=col; i>=0 && j<n; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        //check verticle up
        for(int i=row; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public List<String> construct(char[][] board) {
        List<String> path = new ArrayList<>();

        for(int i=0; i<board.length; i++) {
            path.add(new String(board[i]));
        }

        return path;
    }
}