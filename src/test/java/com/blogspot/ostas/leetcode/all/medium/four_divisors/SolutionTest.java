package com.blogspot.ostas.leetcode.all.medium.four_divisors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [21,4,7]
    Output: 32
    Explanation:
    21 has 4 divisors: 1, 3, 7, 21
    4 has 3 divisors: 1, 2, 4
    7 has 2 divisors: 1, 7
    The answer is the sum of divisors of 21 only.
    Example 2:
    Input: nums = [21,21]
    Output: 64
    Example 3:
    Input: nums = [1,2,3,4,5]
    Output: 0
      Constraints:
    1 <= nums.length <= 104
    1 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{21, 4, 7};
        int expected = 32;
        var result = solution.sumFourDivisors(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{21, 21};
        int expected = 64;
        var result = solution.sumFourDivisors(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int expected = 0;
        var result = solution.sumFourDivisors(nums);
        assertThat(result).isEqualTo(expected);
    }

}
