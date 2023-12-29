package com.blogspot.ostas.leetcode.all.medium.rearrange_array_to_maximize_prefix_score;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,-1,0,1,-3,3,-3]
    Output: 6
    Explanation: We can rearrange the array into nums = [2,3,1,-1,-3,0,-3].
    prefix = [2,5,6,5,2,2,-1], so the score is 6.
    It can be shown that 6 is the maximum score we can obtain.
    Example 2:
    Input: nums = [-2,-3,0]
    Output: 0
    Explanation: Any rearrangement of the array will result in a score of 0.
      Constraints:
    1 <= nums.length <= 105
    -106 <= nums[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, -1, 0, 1, -3, 3, -3};
        int expected = 6;
        var result = solution.maxScore(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-2, -3, 0};
        int expected = 0;
        var result = solution.maxScore(nums);
        assertThat(result).isEqualTo(expected);
    }

}
