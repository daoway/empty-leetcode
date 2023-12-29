package com.blogspot.ostas.leetcode.all.medium.valid_square;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,1]
    Output: true
    Example 2:
    Input: p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,12]
    Output: false
    Example 3:
    Input: p1 = [1,0], p2 = [-1,0], p3 = [0,1], p4 = [0,-1]
    Output: true
      Constraints:
    p1.length == p2.length == p3.length == p4.length == 2
    -104 <= xi, yi <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] p1 = new int[]{0, 0};
        int[] p2 = new int[]{1, 1};
        int[] p3 = new int[]{1, 0};
        int[] p4 = new int[]{0, 1};
        boolean expected = true;
        var result = solution.validSquare(p1, p2, p3, p4);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] p1 = new int[]{0, 0};
        int[] p2 = new int[]{1, 1};
        int[] p3 = new int[]{1, 0};
        int[] p4 = new int[]{0, 12};
        boolean expected = false;
        var result = solution.validSquare(p1, p2, p3, p4);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] p1 = new int[]{1, 0};
        int[] p2 = new int[]{-1, 0};
        int[] p3 = new int[]{0, 1};
        int[] p4 = new int[]{0, -1};
        boolean expected = true;
        var result = solution.validSquare(p1, p2, p3, p4);
        assertThat(result).isEqualTo(expected);
    }

}
