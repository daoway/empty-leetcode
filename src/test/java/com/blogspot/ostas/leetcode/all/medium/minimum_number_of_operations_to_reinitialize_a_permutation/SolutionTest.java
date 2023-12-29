package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_operations_to_reinitialize_a_permutation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2
    Output: 1
    Explanation: perm = [0,1] initially.
    After the 1st operation, perm = [0,1]
    So it takes only 1 operation.
    Example 2:
    Input: n = 4
    Output: 2
    Explanation: perm = [0,1,2,3] initially.
    After the 1st operation, perm = [0,2,1,3]
    After the 2nd operation, perm = [0,1,2,3]
    So it takes only 2 operations.
    Example 3:
    Input: n = 6
    Output: 4
      Constraints:
    2 <= n <= 1000
    n is even.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int expected = 1;
        var result = solution.reinitializePermutation(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int expected = 2;
        var result = solution.reinitializePermutation(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 6;
        int expected = 4;
        var result = solution.reinitializePermutation(n);
        assertThat(result).isEqualTo(expected);
    }

}
