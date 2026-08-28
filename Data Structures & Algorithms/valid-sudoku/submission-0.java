class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer>[] rows = new Set[9];
        Set<Integer>[] columns = new Set[9];
        Set<Integer>[] grids = new Set[9];
        int grid;
        for (int i = 0 ; i < 9 ; i++) {
            rows[i] = new HashSet<Integer>();
            for (int j = 0 ; j < 9 ; j++) {
                if (board[i][j] == '.') continue;
                if (columns[j] == null) columns[j] = new HashSet<Integer>();
                int dig = board[i][j] - '0';
                grid = (i/3) * 3 + (j/3);
                if (grids[grid] == null) grids[grid] = new HashSet<Integer>();
                if (rows[i].contains(dig) || columns[j].contains(dig) || grids[grid].contains(dig)) {
                    return false;
                }
                rows[i].add(dig);
                columns[j].add(dig);
                grids[grid].add(dig);
            }
        }
        return true;
    }
}
