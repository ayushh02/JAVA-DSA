/* Valid Sudoku

Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
 
Example 1:
Input: board = 
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true





CODE:*/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String>seen=new HashSet<>();
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char cur= board[i][j];
                if(cur != '.'){
                    if(!seen.add(cur+"row"+i)||!seen.add(cur+"col"+j)||!seen.add(cur+"grid"+i/3+"-"+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
