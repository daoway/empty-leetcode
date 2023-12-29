package com.blogspot.ostas.leetcode.all.easy.sum_of_values_at_indices_with_k_set_bits;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [5,10,1,5,2], k = 1
    Output: 13
    Explanation: The binary representation of the indices are:
    0 = 0002
    1 = 0012
    2 = 0102
    3 = 0112
    4 = 1002
    Indices 1, 2, and 4 have k = 1 set bits in their binary representation.
    Hence, the answer is nums[1] + nums[2] + nums[4] = 13.
    Example 2:
    Input: nums = [4,3,2,1], k = 2
    Output: 1
    Explanation: The binary representation of the indices are:
    0 = 002
    1 = 012
    2 = 102
    3 = 112
    Only index 3 has k = 2 set bits in its binary representation.
    Hence, the answer is nums[3] = 1.
      Constraints:
    1 <= nums.length <= 1000
    1 <= nums[i] <= 105
    0 <= k <= 10
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> nums = List.of(5, 10, 1, 5, 2);
        int k = 1;
        int expected = 13;
        var result = solution.sumIndicesWithKSetBits(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> nums = List.of(4, 3, 2, 1);
        int k = 2;
        int expected = 1;
        var result = solution.sumIndicesWithKSetBits(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
