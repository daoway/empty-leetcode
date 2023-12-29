package com.blogspot.ostas.leetcode.all.hard.largest_rectangle_in_histogram;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: heights = [2,1,5,6,2,3]
    Output: 10
    Explanation: The above is a histogram where width of each bar is 1.
    The largest rectangle is shown in the red area, which has an area = 10 units.
    Example 2:
    Input: heights = [2,4]
    Output: 4
      Constraints:
    1 <= heights.length <= 105
    0 <= heights[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] heights = new int[]{2, 1, 5, 6, 2, 3};
        int expected = 10;
        var result = solution.largestRectangleArea(heights);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] heights = new int[]{2, 4};
        int expected = 4;
        var result = solution.largestRectangleArea(heights);
        assertThat(result).isEqualTo(expected);
    }

}
