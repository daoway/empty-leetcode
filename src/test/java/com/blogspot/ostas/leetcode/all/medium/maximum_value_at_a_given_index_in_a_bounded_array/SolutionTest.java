package com.blogspot.ostas.leetcode.all.medium.maximum_value_at_a_given_index_in_a_bounded_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, index = 2,  maxSum = 6
    Output: 2
    Explanation: nums = [1,2,2,1] is one array that satisfies all the conditions.
    There are no arrays that satisfy all the conditions and have nums[2] == 3, so 2 is the maximum nums[2].
    Example 2:
    Input: n = 6, index = 1,  maxSum = 10
    Output: 3
      Constraints:
    1 <= n <= maxSum <= 109
    0 <= index < n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int index = 2;
        int maxSum = 6;
        int expected = 2;
        var result = solution.maxValue(n, index, maxSum);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 6;
        int index = 1;
        int maxSum = 10;
        int expected = 3;
        var result = solution.maxValue(n, index, maxSum);
        assertThat(result).isEqualTo(expected);
    }

}
