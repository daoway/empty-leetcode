package com.blogspot.ostas.leetcode.all.medium.maximum_area_of_a_piece_of_cake_after_horizontal_and_vertical_cuts;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: h = 5, w = 4, horizontalCuts = [1,2,4], verticalCuts = [1,3]
    Output: 4
    Explanation: The figure above represents the given rectangular cake. Red lines are the horizontal and vertical cuts. After you cut the cake, the green piece of cake has the maximum area.
    Example 2:
    Input: h = 5, w = 4, horizontalCuts = [3,1], verticalCuts = [1]
    Output: 6
    Explanation: The figure above represents the given rectangular cake. Red lines are the horizontal and vertical cuts. After you cut the cake, the green and yellow pieces of cake have the maximum area.
    Example 3:
    Input: h = 5, w = 4, horizontalCuts = [3], verticalCuts = [3]
    Output: 9
      Constraints:
    2 <= h, w <= 109
    1 <= horizontalCuts.length <= min(h - 1, 105)
    1 <= verticalCuts.length <= min(w - 1, 105)
    1 <= horizontalCuts[i] < h
    1 <= verticalCuts[i] < w
    All the elements in horizontalCuts are distinct.
    All the elements in verticalCuts are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int h = 5;
        int w = 4;
        int[] horizontalCuts = new int[]{1, 2, 4};
        int[] verticalCuts = new int[]{1, 3};
        int expected = 4;
        var result = solution.maxArea(h, w, horizontalCuts, verticalCuts);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int h = 5;
        int w = 4;
        int[] horizontalCuts = new int[]{3, 1};
        int[] verticalCuts = new int[]{1};
        int expected = 6;
        var result = solution.maxArea(h, w, horizontalCuts, verticalCuts);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int h = 5;
        int w = 4;
        int[] horizontalCuts = new int[]{3};
        int[] verticalCuts = new int[]{3};
        int expected = 9;
        var result = solution.maxArea(h, w, horizontalCuts, verticalCuts);
        assertThat(result).isEqualTo(expected);
    }

}
