//https://leetcode.com/problems/majority-element-ii/description/
//Difficulty: Medium

/**
 * @param {number[]} nums
 * @return {number}
 */
 var majorityElement = function(nums) {
    const freqArray = [];
    const resultArray = [];
    for(let i = 0; i < nums.length; i++){
		freqArray[nums[i]] = freqArray[nums[i]] == undefined ? 1 : freqArray[nums[i]] + 1;
		if(freqArray[nums[i]] > nums.length / 3 && freqArray[nums[i]] != Number.MAX_VALUE){
			resultArray.push(nums[i]);
            		freqArray[nums[i]] = Number.MAX_VALUE;
		}
	}
    return resultArray;
};