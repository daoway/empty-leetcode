package com.blogspot.ostas.leetcode.all.easy.count_largest_group;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 13
    Output: 4
    Explanation: There are 9 groups in total, they are grouped according sum of its digits of numbers from 1 to 13:
    [1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9].
    There are 4 groups with largest size.
    Example 2:
    Input: n = 2
    Output: 2
    Explanation: There are 2 groups [1], [2] of size 1.
      Constraints:
    1 <= n <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 13;
        int expected = 4;
        var result = solution.countLargestGroup(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int expected = 2;
        var result = solution.countLargestGroup(n);
        assertThat(result).isEqualTo(expected);
    }

}
