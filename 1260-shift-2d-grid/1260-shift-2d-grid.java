class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        
        List<Integer> nums = new ArrayList<>();
        int shifts = (n * m) - (k % (n * m));

        for(int[] row: grid) {
            for(int x: row) {
                nums.add(x);
            }
        }

        int s = shifts;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(s == nums.size()) {
                    s = 0;
                }
                grid[i][j] = nums.get(s);
                s++;
                if(s == shifts) {
                    break;
                }
            }
        }

        List<List<Integer>> resultGrid = new ArrayList<>();

        for(int i=0; i<n; i++) {
            List<Integer> rowGrid = new ArrayList<>();
            for(int j=0; j<m; j++) {
                rowGrid.add(grid[i][j]);
            }
            resultGrid.add(rowGrid);
        }

        return resultGrid;
    }
}