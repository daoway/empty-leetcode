package com.blogspot.ostas.leetcode.all.medium.number_of_pairs_of_interchangeable_rectangles;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rectangles = [[4,8],[3,6],[10,20],[15,30]]
    Output: 6
    Explanation: The following are the interchangeable pairs of rectangles by index (0-indexed):
    - Rectangle 0 with rectangle 1: 4/8 == 3/6.
    - Rectangle 0 with rectangle 2: 4/8 == 10/20.
    - Rectangle 0 with rectangle 3: 4/8 == 15/30.
    - Rectangle 1 with rectangle 2: 3/6 == 10/20.
    - Rectangle 1 with rectangle 3: 3/6 == 15/30.
    - Rectangle 2 with rectangle 3: 10/20 == 15/30.
    Example 2:
    Input: rectangles = [[4,5],[7,8]]
    Output: 0
    Explanation: There are no interchangeable pairs of rectangles.
      Constraints:
    n == rectangles.length
    1 <= n <= 105
    rectangles[i].length == 2
    1 <= widthi, heighti <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] rectangles = new int[][]{{4, 8}, {3, 6}, {10, 20}, {15, 30}};
        long expected = 6;
        var result = solution.interchangeableRectangles(rectangles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] rectangles = new int[][]{{4, 5}, {7, 8}};
        long expected = 0;
        var result = solution.interchangeableRectangles(rectangles);
        assertThat(result).isEqualTo(expected);
    }

}
