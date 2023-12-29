package com.blogspot.ostas.leetcode.all.hard.maximum_strong_pair_xor_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4,5]
    Output: 7
    Explanation: There are 11 strong pairs in the array nums: (1, 1), (1, 2), (2, 2), (2, 3), (2, 4), (3, 3), (3, 4), (3, 5), (4, 4), (4, 5) and (5, 5).
    The maximum XOR possible from these pairs is 3 XOR 4 = 7.
    Example 2:
    Input: nums = [10,100]
    Output: 0
    Explanation: There are 2 strong pairs in the array nums: (10, 10) and (100, 100).
    The maximum XOR possible from these pairs is 10 XOR 10 = 0 since the pair (100, 100) also gives 100 XOR 100 = 0.
    Example 3:
    Input: nums = [500,520,2500,3000]
    Output: 1020
    Explanation: There are 6 strong pairs in the array nums: (500, 500), (500, 520), (520, 520), (2500, 2500), (2500, 3000) and (3000, 3000).
    The maximum XOR possible from these pairs is 500 XOR 520 = 1020 since the only other non-zero XOR value is 2500 XOR 3000 = 636.
      Constraints:
    1 <= nums.length <= 5 * 104
    1 <= nums[i] <= 220 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int expected = 7;
        var result = solution.maximumStrongPairXor(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{10, 100};
        int expected = 0;
        var result = solution.maximumStrongPairXor(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{500, 520, 2500, 3000};
        int expected = 1020;
        var result = solution.maximumStrongPairXor(nums);
        assertThat(result).isEqualTo(expected);
    }

}
