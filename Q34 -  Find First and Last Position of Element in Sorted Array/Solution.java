//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] positions = {-1, -1};
        if(nums.length == 0){
            return positions;
        }
        if(nums.length == 1 && nums[0] == target){
            positions[0] = 0;
            positions[1] = 0;
        }
        int lo = 0;
        int hi = nums.length - 1;
        while (hi > lo){
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target){
                positions[0] = mid;
                positions[1] = mid;
                for (int i = positions[0] + 1; i <= hi && nums[i] == target; i++){
                    positions[1]++;
                }
                for (int i = positions[0] - 1; i >= lo && nums[i] == target; i--){
                    positions[0]--;
                }
                return positions;
            } else if(target > nums[mid]){
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        if(hi == lo && nums[hi] == target){
            positions[0] = hi;
            positions[1] = lo;
        }
        return positions;
    }
}