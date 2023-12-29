package com.blogspot.ostas.leetcode.all.medium.minimum_operations_to_reduce_an_integer_to_zero_;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 39
    Output: 3
    Explanation: We can do the following operations:
    - Add 20 = 1 to n, so now n = 40.
    - Subtract 23 = 8 from n, so now n = 32.
    - Subtract 25 = 32 from n, so now n = 0.
    It can be shown that 3 is the minimum number of operations we need to make n equal to 0.
    Example 2:
    Input: n = 54
    Output: 3
    Explanation: We can do the following operations:
    - Add 21 = 2 to n, so now n = 56.
    - Add 23 = 8 to n, so now n = 64.
    - Subtract 26 = 64 from n, so now n = 0.
    So the minimum number of operations is 3.
      Constraints:
    1 <= n <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 39;
        int expected = 3;
        var result = solution.minOperations(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 54;
        int expected = 3;
        var result = solution.minOperations(n);
        assertThat(result).isEqualTo(expected);
    }

}
