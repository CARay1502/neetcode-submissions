/**
Given a 9x9 board of sudoku (2d array) find if board is valid:
- each row contain digits 1-9
- each column contain digits 1-9
- each 3x3 sub box in grid contains 1-9
Does not have to be full or solvable to be valid. 

Hash Map (one pass) Solution On^2: 
instead we check each condition with each cell and has appeared in either row, col or square=
to do this, track using three hash map:  
- rows[r]
- cols[c]
- squares[r / 3, c / 3]
step 0: create three hash map sets for row, col, square
step 1: iterate through every cell in board 
- use nested for loop: 
- skip if cell == '.'
- char val = digit of cell
- if val is already in rows, col, sqauare[(r / 3, c / 3)] return false
- otherwise add digit to all three sets. 
step 2: after whole board is scanned, return true. 
**/
class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') { continue; }

                //calculate square
                String squareKey = (r / 3) + "," + (c / 3);
                 if (rows.computeIfAbsent(r, k -> new HashSet<>()).contains(board[r][c]) ||
                    cols.computeIfAbsent(c, k -> new HashSet<>()).contains(board[r][c]) ||
                    squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(board[r][c])) {
                    return false;
                }

                rows.get(r).add(board[r][c]);
                cols.get(c).add(board[r][c]);
                squares.get(squareKey).add(board[r][c]);
            }
        }
        return true;
    }
}
