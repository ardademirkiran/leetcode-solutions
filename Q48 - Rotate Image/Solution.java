//https://leetcode.com/problems/rotate-image/

class Solution {
    public void rotate(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length / 2; column++) {
                int valueToSwap1 = matrix[row][column];
                matrix[row][column] = matrix[row][matrix.length - 1 - column];
                matrix[row][matrix.length - 1 - column] = valueToSwap1;
            }
        }
        int row = 0;
        int column = 0;
        int columnLimit = matrix.length - 2;
        while (columnLimit >= 0) {
            int valueToSwap2 = matrix[row][column];
            matrix[row][column] = matrix[matrix.length - 1 - column][matrix.length - 1 - row];
            matrix[matrix.length - 1 - column][matrix.length - 1 - row] = valueToSwap2;
            column++;
            if (column > columnLimit) {
                row++;
                column = 0;
                columnLimit--;
            }
        }
    }
}