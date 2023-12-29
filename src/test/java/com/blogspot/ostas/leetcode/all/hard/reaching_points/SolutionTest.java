package com.blogspot.ostas.leetcode.all.hard.reaching_points;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: sx = 1, sy = 1, tx = 3, ty = 5
    Output: true
    Explanation:
    One series of moves that transforms the starting point to the target is:
    (1, 1) -> (1, 2)
    (1, 2) -> (3, 2)
    (3, 2) -> (3, 5)
    Example 2:
    Input: sx = 1, sy = 1, tx = 2, ty = 2
    Output: false
    Example 3:
    Input: sx = 1, sy = 1, tx = 1, ty = 1
    Output: true
      Constraints:
    1 <= sx, sy, tx, ty <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int sx = 1;
        int sy = 1;
        int tx = 3;
        int ty = 5;
        boolean expected = true;
        var result = solution.reachingPoints(sx, sy, tx, ty);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int sx = 1;
        int sy = 1;
        int tx = 2;
        int ty = 2;
        boolean expected = false;
        var result = solution.reachingPoints(sx, sy, tx, ty);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int sx = 1;
        int sy = 1;
        int tx = 1;
        int ty = 1;
        boolean expected = true;
        var result = solution.reachingPoints(sx, sy, tx, ty);
        assertThat(result).isEqualTo(expected);
    }

}
