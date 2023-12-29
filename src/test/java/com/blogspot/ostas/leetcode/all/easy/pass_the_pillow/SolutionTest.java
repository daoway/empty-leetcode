package com.blogspot.ostas.leetcode.all.easy.pass_the_pillow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, time = 5
    Output: 2
    Explanation: People pass the pillow in the following way: 1 -> 2 -> 3 -> 4 -> 3 -> 2.
    Afer five seconds, the pillow is given to the 2nd person.
    Example 2:
    Input: n = 3, time = 2
    Output: 3
    Explanation: People pass the pillow in the following way: 1 -> 2 -> 3.
    Afer two seconds, the pillow is given to the 3rd person.
      Constraints:
    2 <= n <= 1000
    1 <= time <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int time = 5;
        int expected = 2;
        var result = solution.passThePillow(n, time);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int time = 2;
        int expected = 3;
        var result = solution.passThePillow(n, time);
        assertThat(result).isEqualTo(expected);
    }

}
