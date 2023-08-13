//https://leetcode.com/problems/spiral-matrix/description/
//Difficulty: Medium

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int x = 0;
        int y = 0;
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1, 0}};
        int directionsIndex = 0;
        int numCounter = 0;
        while(numCounter != matrix.length * matrix[0].length){
            resultList.add(matrix[y][x]);
            matrix[y][x] = -101;
            int nextX = x + directions[directionsIndex][1];
            int nextY = y + directions[directionsIndex][0];
            if(nextX == matrix[0].length || nextY == matrix.length || nextX == -1 || nextY == -1 || matrix[nextY][nextX] == -101){
                directionsIndex = (directionsIndex + 1) % 4;
            }
            x += directions[directionsIndex][1];
            y += directions[directionsIndex][0];
            numCounter++;
        }
        return resultList;
    }
}