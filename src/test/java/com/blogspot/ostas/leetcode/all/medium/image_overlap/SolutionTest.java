package com.blogspot.ostas.leetcode.all.medium.image_overlap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: img1 = [[1,1,0],[0,1,0],[0,1,0]], img2 = [[0,0,0],[0,1,1],[0,0,1]]
    Output: 3
    Explanation: We translate img1 to right by 1 unit and down by 1 unit.
    The number of positions that have a 1 in both images is 3 (shown in red).
    Example 2:
    Input: img1 = [[1]], img2 = [[1]]
    Output: 1
    Example 3:
    Input: img1 = [[0]], img2 = [[0]]
    Output: 0
      Constraints:
    n == img1.length == img1[i].length
    n == img2.length == img2[i].length
    1 <= n <= 30
    img1[i][j] is either 0 or 1.
    img2[i][j] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] img1 = new int[][]{{1, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        int[][] img2 = new int[][]{{0, 0, 0}, {0, 1, 1}, {0, 0, 1}};
        int expected = 3;
        var result = solution.largestOverlap(img1, img2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] img1 = new int[][]{{1}};
        int[][] img2 = new int[][]{{1}};
        int expected = 1;
        var result = solution.largestOverlap(img1, img2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] img1 = new int[][]{{0}};
        int[][] img2 = new int[][]{{0}};
        int expected = 0;
        var result = solution.largestOverlap(img1, img2);
        assertThat(result).isEqualTo(expected);
    }

}
