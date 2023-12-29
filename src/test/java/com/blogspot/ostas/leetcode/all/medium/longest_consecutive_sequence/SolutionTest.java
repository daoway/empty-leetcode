package com.blogspot.ostas.leetcode.all.medium.longest_consecutive_sequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [100,4,200,1,3,2]
    Output: 4
    Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
    Example 2:
    Input: nums = [0,3,7,2,5,8,4,6,0,1]
    Output: 9
      Constraints:
    0 <= nums.length <= 105
    -109 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        int expected = 4;
        var result = solution.longestConsecutive(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int expected = 9;
        var result = solution.longestConsecutive(nums);
        assertThat(result).isEqualTo(expected);
    }

}
