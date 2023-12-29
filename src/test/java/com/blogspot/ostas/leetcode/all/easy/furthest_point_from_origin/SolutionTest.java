package com.blogspot.ostas.leetcode.all.easy.furthest_point_from_origin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: moves = "L_RL__R"
    Output: 3
    Explanation: The furthest point we can reach from the origin 0 is point -3 through the following sequence of moves "LLRLLLR".
    Example 2:
    Input: moves = "_R__LL_"
    Output: 5
    Explanation: The furthest point we can reach from the origin 0 is point -5 through the following sequence of moves "LRLLLLL".
    Example 3:
    Input: moves = "_______"
    Output: 7
    Explanation: The furthest point we can reach from the origin 0 is point 7 through the following sequence of moves "RRRRRRR".
      Constraints:
    1 <= moves.length == n <= 50
    moves consists only of characters 'L', 'R' and '_'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String moves = "L_RL__R";
        int expected = 3;
        var result = solution.furthestDistanceFromOrigin(moves);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String moves = "_R__LL_";
        int expected = 5;
        var result = solution.furthestDistanceFromOrigin(moves);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String moves = "_______";
        int expected = 7;
        var result = solution.furthestDistanceFromOrigin(moves);
        assertThat(result).isEqualTo(expected);
    }

}
