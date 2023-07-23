//https://leetcode.com/problems/valid-sudoku/description/
//Difficulty: Medium

class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][10];
        boolean[][] columns = new boolean[9][10];
        boolean[][][] subboxes = new boolean[3][3][10];
        for(int rowNum = 0; rowNum < 9; rowNum++){
            for(int columnNum = 0; columnNum < 9; columnNum++){
                if(board[rowNum][columnNum] == '.') continue;
                int currentNum = Integer.parseInt(String.valueOf(board[rowNum][columnNum]));
                boolean checkRow = rows[rowNum][currentNum];
                boolean checkColumn = columns[columnNum][currentNum];
                boolean checkSubBox = subboxes[rowNum / 3][columnNum /3][currentNum];
                if(checkRow || checkColumn || checkSubBox){
                    return false;
                }
                rows[rowNum][currentNum] = true;
                columns[columnNum][currentNum] = true;
                subboxes[rowNum / 3][columnNum / 3][currentNum] = true;
            }
        }
        return true;
    }
}