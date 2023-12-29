package com.blogspot.ostas.leetcode.all.medium.beautiful_arrangement;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2
    Output: 2
    Explanation:
    The first beautiful arrangement is [1,2]:
    - perm[1] = 1 is divisible by i = 1
    - perm[2] = 2 is divisible by i = 2
    The second beautiful arrangement is [2,1]:
    - perm[1] = 2 is divisible by i = 1
    - i = 2 is divisible by perm[2] = 1
    Example 2:
    Input: n = 1
    Output: 1
      Constraints:
    1 <= n <= 15
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int expected = 2;
        var result = solution.countArrangement(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int expected = 1;
        var result = solution.countArrangement(n);
        assertThat(result).isEqualTo(expected);
    }

}
