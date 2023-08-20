//https://leetcode.com/problems/majority-element/description/
//Difficulty: Easy


/**
 * @param {number[]} nums
 * @return {number}
 */
 var majorityElement = function(nums) {
    const freqArray = [];
    for(let i = 0; i < nums.length; i++){
		freqArray[nums[i]] = freqArray[nums[i]] == undefined ? 1 : freqArray[nums[i]] + 1;
		if(freqArray[nums[i]] > nums.length / 2){
			return nums[i];
		}
	}
};