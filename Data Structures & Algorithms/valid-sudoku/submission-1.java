class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] columns = new int[9];
        int[] grids = new int[9];
        for (int i = 0 ; i < 9 ; i++) {
            for (int j = 0 ; j < 9 ; j++) {
                if (board[i][j] == '.') continue;
                int dig = board[i][j] - '1';
                int bit = 1 << dig;
                int grid = (i/3) * 3 + (j/3);
                if ((rows[i] & bit) != 0 || (columns[j] & bit) != 0 || (grids[grid] & bit) != 0) {
                    return false;
                }
                rows[i] |= bit;
                columns[j] |= bit;
                grids[grid] |= bit;
            }
        }
        return true;
    }
}
