/**
Given a 9x9 board of sudoku (2d array) find if board is valid:
- each row contain digits 1-9
- each column contain digits 1-9
- each 3x3 sub box in grid contains 1-9
Does not have to be full or solvable to be valid. 

brute force solution: check each condition one by one
step 0: initialize for loop - iterate ovber row
- create empty set 
- for each column index i from 0 to 8
- skip if cell is "."
- if value is already in set, return false. 
- otherwise add to set. 
step 1: check all columns: 
- create empty set
- for each row index i from 0 to 8
- if value is already in set, return false. 
- otherwise add to set.
step 2: for ecah square: 
- creat empty hashset
- for i in 0 - 2 and j in 0-2: 
- compute row = (square / 3) * 3 + i
- compute col = (square % 3) * 3 + j
- skip if cell == "."
- if value is already in hashset, return false. 
- otherwise add to seen
step 3: after all conditions
return true. 
**/
class Solution {
    public boolean isValidSudoku(char[][] board) {
        //step 0
        for (int row = 0; row < 9; row++) {
            Set<Character> visited = new HashSet<>(); //make sure set is inside each row iteration
            for (int i = 0; i < 9; i++) {
                if (board[row][i] == '.') { continue; }
                if (visited.contains(board[row][i])) { return false; }
                visited.add(board[row][i]);
            }
        }
        //step 1
        for (int col = 0; col < 9; col++) {
            Set<Character> visited = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[i][col] == '.') { continue; }
                if (visited.contains(board[i][col])) { return false; }
                visited.add(board[i][col]);
            }
        }
        // step 2 
        for (int square = 0; square < 9; square++) {
            Set<Character> visited = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (board[row][col] == '.') { continue; }
                    if (visited.contains(board[row][col])) { return false; }
                    visited.add(board[row][col]); 
                }
            }
        }
        // final condition - step 3
        return true;
    }
}
