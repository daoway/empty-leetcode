package com.blogspot.ostas.leetcode.all.easy.maximum_number_of_balls_in_a_box;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: lowLimit = 1, highLimit = 10
    Output: 2
    Explanation:
    Box Number:  1 2 3 4 5 6 7 8 9 10 11 ...
    Ball Count:  2 1 1 1 1 1 1 1 1 0  0  ...
    Box 1 has the most number of balls with 2 balls.
    Example 2:
    Input: lowLimit = 5, highLimit = 15
    Output: 2
    Explanation:
    Box Number:  1 2 3 4 5 6 7 8 9 10 11 ...
    Ball Count:  1 1 1 1 2 2 1 1 1 0  0  ...
    Boxes 5 and 6 have the most number of balls with 2 balls in each.
    Example 3:
    Input: lowLimit = 19, highLimit = 28
    Output: 2
    Explanation:
    Box Number:  1 2 3 4 5 6 7 8 9 10 11 12 ...
    Ball Count:  0 1 1 1 1 1 1 1 1 2  0  0  ...
    Box 10 has the most number of balls with 2 balls.
      Constraints:
    1 <= lowLimit <= highLimit <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int lowLimit = 1;
        int highLimit = 10;
        int expected = 2;
        var result = solution.countBalls(lowLimit, highLimit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int lowLimit = 5;
        int highLimit = 15;
        int expected = 2;
        var result = solution.countBalls(lowLimit, highLimit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int lowLimit = 19;
        int highLimit = 28;
        int expected = 2;
        var result = solution.countBalls(lowLimit, highLimit);
        assertThat(result).isEqualTo(expected);
    }

}
