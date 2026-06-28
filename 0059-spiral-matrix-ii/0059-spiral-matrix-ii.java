class Solution {
    public int[][] generateMatrix(int n) {
        int[][] spiralMatrix = new int[n][n];
        int val = 1;
        
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = n-1;
        
        while(rowStart <= rowEnd && colStart <= colEnd) {
            for(int i=colStart; i<=colEnd; i++) {
                spiralMatrix[rowStart][i] = val++;
            }
            rowStart++;

            for(int i=rowStart; i<=rowEnd; i++) {
                spiralMatrix[i][colEnd] = val++;
            } 
            colEnd--;

            for(int i=colEnd; i>=colStart; i--) {
                spiralMatrix[rowEnd][i] = val++;
            }
            rowEnd--;

            for(int i=rowEnd; i>=rowStart; i--) {
                spiralMatrix[i][colStart] = val++;
            }
            colStart++;
        }

        return spiralMatrix;
    }
}