package com.blogspot.ostas.leetcode.all.medium.maximum_xor_of_two_numbers_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,10,5,25,2,8]
    Output: 28
    Explanation: The maximum result is 5 XOR 25 = 28.
    Example 2:
    Input: nums = [14,70,53,83,49,91,36,80,92,51,66,70]
    Output: 127
      Constraints:
    1 <= nums.length <= 2 * 105
    0 <= nums[i] <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 10, 5, 25, 2, 8};
        int expected = 28;
        var result = solution.findMaximumXOR(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70};
        int expected = 127;
        var result = solution.findMaximumXOR(nums);
        assertThat(result).isEqualTo(expected);
    }

}
