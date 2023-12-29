package com.blogspot.ostas.leetcode.all.easy.number_of_rectangles_that_can_form_the_largest_square;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rectangles = [[5,8],[3,9],[5,12],[16,5]]
    Output: 3
    Explanation: The largest squares you can get from each rectangle are of lengths [5,3,5,5].
    The largest possible square is of length 5, and you can get it out of 3 rectangles.
    Example 2:
    Input: rectangles = [[2,3],[3,7],[4,3],[3,7]]
    Output: 3
      Constraints:
    1 <= rectangles.length <= 1000
    rectangles[i].length == 2
    1 <= li, wi <= 109
    li != wi
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] rectangles = new int[][]{{5, 8}, {3, 9}, {5, 12}, {16, 5}};
        int expected = 3;
        var result = solution.countGoodRectangles(rectangles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] rectangles = new int[][]{{2, 3}, {3, 7}, {4, 3}, {3, 7}};
        int expected = 3;
        var result = solution.countGoodRectangles(rectangles);
        assertThat(result).isEqualTo(expected);
    }

}
