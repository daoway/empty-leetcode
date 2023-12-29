package com.blogspot.ostas.leetcode.all.hard.number_of_ways_to_rearrange_sticks_with_k_sticks_visible;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, k = 2
    Output: 3
    Explanation: [1,3,2], [2,3,1], and [2,1,3] are the only arrangements such that exactly 2 sticks are visible.
    The visible sticks are underlined.
    Example 2:
    Input: n = 5, k = 5
    Output: 1
    Explanation: [1,2,3,4,5] is the only arrangement such that all 5 sticks are visible.
    The visible sticks are underlined.
    Example 3:
    Input: n = 20, k = 11
    Output: 647427950
    Explanation: There are 647427950 (mod 109 + 7) ways to rearrange the sticks such that exactly 11 sticks are visible.
      Constraints:
    1 <= n <= 1000
    1 <= k <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int k = 2;
        int expected = 3;
        var result = solution.rearrangeSticks(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int k = 5;
        int expected = 1;
        var result = solution.rearrangeSticks(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 20;
        int k = 11;
        int expected = 647427950;
        var result = solution.rearrangeSticks(n, k);
        assertThat(result).isEqualTo(expected);
    }

}
