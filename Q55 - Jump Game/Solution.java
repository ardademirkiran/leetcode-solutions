//https://leetcode.com/problems/jump-game/description/

class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) return true;
        int minimumUnreachedIndex = 1;
        boolean[] reachableIndexes = new boolean[nums.length];
        reachableIndexes[0] = true;
        for(int i = 0; reachableIndexes[i];){
            int maxDistance = 0;
            int maxDistanceIndex = i;
            if(nums[minimumUnreachedIndex - 1] == 0) return false;
            for(int j = i; j < i + nums[i] + 1; j++){
                if(j + nums[j] > maxDistance){
                    maxDistance = j + nums[j];
                    maxDistanceIndex = j;
                }
                reachableIndexes[j] = true;
                if(j >= minimumUnreachedIndex) minimumUnreachedIndex = j + 1;
                if(j == nums.length - 1) return true;
                i = maxDistanceIndex;
            }
        }
        return reachableIndexes[nums.length - 1];
    }
}