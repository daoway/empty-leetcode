package com.blogspot.ostas.leetcode.all.medium.total_hamming_distance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,14,2]
    Output: 6
    Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is 0010 (just
    showing the four bits relevant in this case).
    The answer will be:
    HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.
    Example 2:
    Input: nums = [4,14,4]
    Output: 4
      Constraints:
    1 <= nums.length <= 104
    0 <= nums[i] <= 109
    The answer for the given input will fit in a 32-bit integer.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 14, 2};
        int expected = 6;
        var result = solution.totalHammingDistance(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4, 14, 4};
        int expected = 4;
        var result = solution.totalHammingDistance(nums);
        assertThat(result).isEqualTo(expected);
    }

}
