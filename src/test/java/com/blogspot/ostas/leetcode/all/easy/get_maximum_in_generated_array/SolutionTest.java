package com.blogspot.ostas.leetcode.all.easy.get_maximum_in_generated_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 7
    Output: 3
    Explanation: According to the given rules:
      nums[0] = 0
      nums[1] = 1
      nums[(1 * 2) = 2] = nums[1] = 1
      nums[(1 * 2) + 1 = 3] = nums[1] + nums[2] = 1 + 1 = 2
      nums[(2 * 2) = 4] = nums[2] = 1
      nums[(2 * 2) + 1 = 5] = nums[2] + nums[3] = 1 + 2 = 3
      nums[(3 * 2) = 6] = nums[3] = 2
      nums[(3 * 2) + 1 = 7] = nums[3] + nums[4] = 2 + 1 = 3
    Hence, nums = [0,1,1,2,1,3,2,3], and the maximum is max(0,1,1,2,1,3,2,3) = 3.
    Example 2:
    Input: n = 2
    Output: 1
    Explanation: According to the given rules, nums = [0,1,1]. The maximum is max(0,1,1) = 1.
    Example 3:
    Input: n = 3
    Output: 2
    Explanation: According to the given rules, nums = [0,1,1,2]. The maximum is max(0,1,1,2) = 2.
      Constraints:
    0 <= n <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 7;
        int expected = 3;
        var result = solution.getMaximumGenerated(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int expected = 1;
        var result = solution.getMaximumGenerated(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 3;
        int expected = 2;
        var result = solution.getMaximumGenerated(n);
        assertThat(result).isEqualTo(expected);
    }

}
