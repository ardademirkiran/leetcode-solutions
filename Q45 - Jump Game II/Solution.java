class Solution {
    public int jump(int[] nums) {
        int currentPosition = 0;
        int nextStep = 0;
        int nextMax = 0;
        int stepCount = 0;
        for (;currentPosition < nums.length - 1; stepCount++, currentPosition = nextStep) {
            for(int i = currentPosition + 1; i <= currentPosition + nums[currentPosition]; i++){
                if (i >= nums.length - 1) return ++stepCount;
                if (i + nums[i] > nextMax){
                    nextMax = i + nums[i];
                    nextStep = i;
                }
            }
        }
        return stepCount;
    }
}