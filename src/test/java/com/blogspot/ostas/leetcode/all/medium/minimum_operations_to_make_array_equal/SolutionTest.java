package com.blogspot.ostas.leetcode.all.medium.minimum_operations_to_make_array_equal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3
    Output: 2
    Explanation: arr = [1, 3, 5]
    First operation choose x = 2 and y = 0, this leads arr to be [2, 3, 4]
    In the second operation choose x = 2 and y = 0 again, thus arr = [3, 3, 3].
    Example 2:
    Input: n = 6
    Output: 9
      Constraints:
    1 <= n <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int expected = 2;
        var result = solution.minOperations(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 6;
        int expected = 9;
        var result = solution.minOperations(n);
        assertThat(result).isEqualTo(expected);
    }

}
