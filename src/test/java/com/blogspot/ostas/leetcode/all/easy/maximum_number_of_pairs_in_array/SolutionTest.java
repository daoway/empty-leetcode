package com.blogspot.ostas.leetcode.all.easy.maximum_number_of_pairs_in_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,2,1,3,2,2]
    Output: [3,1]
    Explanation:
    Form a pair with nums[0] and nums[3] and remove them from nums. Now, nums = [3,2,3,2,2].
    Form a pair with nums[0] and nums[2] and remove them from nums. Now, nums = [2,2,2].
    Form a pair with nums[0] and nums[1] and remove them from nums. Now, nums = [2].
    No more pairs can be formed. A total of 3 pairs have been formed, and there is 1 number leftover in nums.
    Example 2:
    Input: nums = [1,1]
    Output: [1,0]
    Explanation: Form a pair with nums[0] and nums[1] and remove them from nums. Now, nums = [].
    No more pairs can be formed. A total of 1 pair has been formed, and there are 0 numbers leftover in nums.
    Example 3:
    Input: nums = [0]
    Output: [0,1]
    Explanation: No pairs can be formed, and there is 1 number leftover in nums.
      Constraints:
    1 <= nums.length <= 100
    0 <= nums[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 2, 1, 3, 2, 2};
        int[] expected = new int[]{3, 1};
        var result = solution.numberOfPairs(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1};
        int[] expected = new int[]{1, 0};
        var result = solution.numberOfPairs(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{0};
        int[] expected = new int[]{0, 1};
        var result = solution.numberOfPairs(nums);
        assertThat(result).isEqualTo(expected);
    }

}
