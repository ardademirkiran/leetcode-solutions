//https://leetcode.com/problems/container-with-most-water/


class Solution {
    public int maxArea(int[] height) {
        double currentMax = 0;
        double minIncrement = 1;
        for (int i = 0; i < height.length; i++){
            minIncrement = Math.ceil(currentMax / height[i]);
            if (minIncrement == 0) minIncrement = 1;
            for (int j = (int) (i + minIncrement) ; j < height.length; j++){
                currentMax = Math.max(currentMax, Math.min(height[i], height[j]) * Math.abs(i - j));
            }
        }

        return (int) currentMax;
    }
}