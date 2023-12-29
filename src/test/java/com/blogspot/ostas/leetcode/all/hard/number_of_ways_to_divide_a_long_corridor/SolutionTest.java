package com.blogspot.ostas.leetcode.all.hard.number_of_ways_to_divide_a_long_corridor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: corridor = "SSPPSPS"
    Output: 3
    Explanation: There are 3 different ways to divide the corridor.
    The black bars in the above image indicate the two room dividers already installed.
    Note that in each of the ways, each section has exactly two seats.
    Example 2:
    Input: corridor = "PPSPSP"
    Output: 1
    Explanation: There is only 1 way to divide the corridor, by not installing any additional dividers.
    Installing any would create some section that does not have exactly two seats.
    Example 3:
    Input: corridor = "S"
    Output: 0
    Explanation: There is no way to divide the corridor because there will always be a section that does not have exactly two seats.
      Constraints:
    n == corridor.length
    1 <= n <= 105
    corridor[i] is either 'S' or 'P'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String corridor = "SSPPSPS";
        int expected = 3;
        var result = solution.numberOfWays(corridor);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String corridor = "PPSPSP";
        int expected = 1;
        var result = solution.numberOfWays(corridor);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String corridor = "S";
        int expected = 0;
        var result = solution.numberOfWays(corridor);
        assertThat(result).isEqualTo(expected);
    }

}
