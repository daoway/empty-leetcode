package com.blogspot.ostas.leetcode.all.hard.super_washing_machines;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: machines = [1,0,5]
    Output: 3
    Explanation:
    1st move:    1     0 <-- 5    =>    1     1     4
    2nd move:    1 <-- 1 <-- 4    =>    2     1     3
    3rd move:    2     1 <-- 3    =>    2     2     2
    Example 2:
    Input: machines = [0,3,0]
    Output: 2
    Explanation:
    1st move:    0 <-- 3     0    =>    1     2     0
    2nd move:    1     2 --> 0    =>    1     1     1
    Example 3:
    Input: machines = [0,2,0]
    Output: -1
    Explanation:
    It's impossible to make all three washing machines have the same number of dresses.
      Constraints:
    n == machines.length
    1 <= n <= 104
    0 <= machines[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] machines = new int[]{1, 0, 5};
        int expected = 3;
        var result = solution.findMinMoves(machines);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] machines = new int[]{0, 3, 0};
        int expected = 2;
        var result = solution.findMinMoves(machines);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] machines = new int[]{0, 2, 0};
        int expected = -1;
        var result = solution.findMinMoves(machines);
        assertThat(result).isEqualTo(expected);
    }

}
