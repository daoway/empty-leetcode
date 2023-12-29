package com.blogspot.ostas.leetcode.all.medium.maximum_xor_after_operations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,2,4,6]
    Output: 7
    Explanation: Apply the operation with x = 4 and i = 3, num[3] = 6 AND (6 XOR 4) = 6 AND 2 = 2.
    Now, nums = [3, 2, 4, 2] and the bitwise XOR of all the elements = 3 XOR 2 XOR 4 XOR 2 = 7.
    It can be shown that 7 is the maximum possible bitwise XOR.
    Note that other operations may be used to achieve a bitwise XOR of 7.
    Example 2:
    Input: nums = [1,2,3,9,2]
    Output: 11
    Explanation: Apply the operation zero times.
    The bitwise XOR of all the elements = 1 XOR 2 XOR 3 XOR 9 XOR 2 = 11.
    It can be shown that 11 is the maximum possible bitwise XOR.
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 108
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 4, 6};
        int expected = 7;
        var result = solution.maximumXOR(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 9, 2};
        int expected = 11;
        var result = solution.maximumXOR(nums);
        assertThat(result).isEqualTo(expected);
    }

}
