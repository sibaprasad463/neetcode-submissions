class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Set<String> seen = new HashSet<>();

        // for (int row = 0; row < 9; row++) {

        //     for (int col = 0; col < 9; col++) {

        //         char num = board[row][col];

        //         if (num == '.') {
        //             continue;
        //         }

        //         // Check row
        //         String rowKey = num + " in row " + row;

        //         // Check column
        //         String colKey = num + " in col " + col;

        //         // Check 3x3 box
        //         String boxKey = num + " in box " + (row / 3) + "-" + (col / 3);

        //         if (!seen.add(rowKey) ||
        //             !seen.add(colKey) ||
        //             !seen.add(boxKey)) {

        //             return false;
        //         }
        //     }
        // }

        // return true;

        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                char cell = board[row][col];

                if (cell == '.') {
                    continue;
                }

                int num = cell - '1';

                int boxIndex = (row / 3) * 3 + (col / 3);

                // duplicate found
                if (rows[row][num] ||
                    cols[col][num] ||
                    boxes[boxIndex][num]) {

                    return false;
                }

                rows[row][num] = true;
                cols[col][num] = true;
                boxes[boxIndex][num] = true;
            }
        }

        return true;


    }
}
