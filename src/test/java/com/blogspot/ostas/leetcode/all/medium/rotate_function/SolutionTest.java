package com.blogspot.ostas.leetcode.all.medium.rotate_function;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,3,2,6]
    Output: 26
    Explanation:
    F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
    F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
    F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
    F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26
    So the maximum value of F(0), F(1), F(2), F(3) is F(3) = 26.
    Example 2:
    Input: nums = [100]
    Output: 0
      Constraints:
    n == nums.length
    1 <= n <= 105
    -100 <= nums[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 3, 2, 6};
        int expected = 26;
        var result = solution.maxRotateFunction(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{100};
        int expected = 0;
        var result = solution.maxRotateFunction(nums);
        assertThat(result).isEqualTo(expected);
    }

}
