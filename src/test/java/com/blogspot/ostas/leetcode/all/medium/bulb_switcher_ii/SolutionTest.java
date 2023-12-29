package com.blogspot.ostas.leetcode.all.medium.bulb_switcher_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1, presses = 1
    Output: 2
    Explanation: Status can be:
    - [off] by pressing button 1
    - [on] by pressing button 2
    Example 2:
    Input: n = 2, presses = 1
    Output: 3
    Explanation: Status can be:
    - [off, off] by pressing button 1
    - [on, off] by pressing button 2
    - [off, on] by pressing button 3
    Example 3:
    Input: n = 3, presses = 1
    Output: 4
    Explanation: Status can be:
    - [off, off, off] by pressing button 1
    - [off, on, off] by pressing button 2
    - [on, off, on] by pressing button 3
    - [off, on, on] by pressing button 4
      Constraints:
    1 <= n <= 1000
    0 <= presses <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        int presses = 1;
        int expected = 2;
        var result = solution.flipLights(n, presses);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int presses = 1;
        int expected = 3;
        var result = solution.flipLights(n, presses);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 3;
        int presses = 1;
        int expected = 4;
        var result = solution.flipLights(n, presses);
        assertThat(result).isEqualTo(expected);
    }

}
