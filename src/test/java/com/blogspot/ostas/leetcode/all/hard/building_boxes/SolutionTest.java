package com.blogspot.ostas.leetcode.all.hard.building_boxes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3
    Output: 3
    Explanation: The figure above is for the placement of the three boxes.
    These boxes are placed in the corner of the room, where the corner is on the left side.
    Example 2:
    Input: n = 4
    Output: 3
    Explanation: The figure above is for the placement of the four boxes.
    These boxes are placed in the corner of the room, where the corner is on the left side.
    Example 3:
    Input: n = 10
    Output: 6
    Explanation: The figure above is for the placement of the ten boxes.
    These boxes are placed in the corner of the room, where the corner is on the back side.
      Constraints:
    1 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int expected = 3;
        var result = solution.minimumBoxes(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int expected = 3;
        var result = solution.minimumBoxes(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 10;
        int expected = 6;
        var result = solution.minimumBoxes(n);
        assertThat(result).isEqualTo(expected);
    }

}
