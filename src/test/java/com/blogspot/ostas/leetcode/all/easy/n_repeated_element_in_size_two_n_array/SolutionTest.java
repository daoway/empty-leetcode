package com.blogspot.ostas.leetcode.all.easy.n_repeated_element_in_size_two_n_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,3]
    Output: 3
    Example 2:
    Input: nums = [2,1,2,5,3,2]
    Output: 2
    Example 3:
    Input: nums = [5,1,5,2,5,3,5,4]
    Output: 5
      Constraints:
    2 <= n <= 5000
    nums.length == 2 * n
    0 <= nums[i] <= 104
    nums contains n + 1 unique elements and one of them is repeated exactly n times.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 3};
        int expected = 3;
        var result = solution.repeatedNTimes(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, 2, 5, 3, 2};
        int expected = 2;
        var result = solution.repeatedNTimes(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{5, 1, 5, 2, 5, 3, 5, 4};
        int expected = 5;
        var result = solution.repeatedNTimes(nums);
        assertThat(result).isEqualTo(expected);
    }

}
