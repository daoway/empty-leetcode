package com.blogspot.ostas.leetcode.all.medium.maximize_area_of_square_hole_in_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2, m = 1, hBars = [2,3], vBars = [2]
    Output: 4
    Explanation: The left image shows the initial grid formed by the bars.
    The horizontal bars are in the range [1,4], and the vertical bars are in the range [1,3].
    It is allowed to remove horizontal bars [2,3] and the vertical bar [2].
    One way to get the maximum square-shaped hole is by removing horizontal bar 2 and vertical bar 2.
    The resulting grid is shown on the right.
    The hole has an area of 4.
    It can be shown that it is not possible to get a square hole with an area more than 4.
    Hence, the answer is 4.
    Example 2:
    Input: n = 1, m = 1, hBars = [2], vBars = [2]
    Output: 4
    Explanation: The left image shows the initial grid formed by the bars.
    The horizontal bars are in the range [1,3], and the vertical bars are in the range [1,3].
    It is allowed to remove the horizontal bar [2] and the vertical bar [2].
    To get the maximum square-shaped hole, we remove horizontal bar 2 and vertical bar 2.
    The resulting grid is shown on the right.
    The hole has an area of 4.
    Hence, the answer is 4, and it is the maximum possible.
    Example 3:
    Input: n = 2, m = 3, hBars = [2,3], vBars = [2,3,4]
    Output: 9
    Explanation: The left image shows the initial grid formed by the bars.
    The horizontal bars are in the range [1,4], and the vertical bars are in the range [1,5].
    It is allowed to remove horizontal bars [2,3] and vertical bars [2,3,4].
    One way to get the maximum square-shaped hole is by removing horizontal bars 2 and 3, and vertical bars 3 and 4.
    The resulting grid is shown on the right.
    The hole has an area of 9.
    It can be shown that it is not possible to get a square hole with an area more than 9.
    Hence, the answer is 9.
      Constraints:
    1 <= n <= 109
    1 <= m <= 109
    1 <= hBars.length <= 100
    2 <= hBars[i] <= n + 1
    1 <= vBars.length <= 100
    2 <= vBars[i] <= m + 1
    All values in hBars are distinct.
    All values in vBars are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int m = 1;
        int[] hBars = new int[]{2, 3};
        int[] vBars = new int[]{2};
        int expected = 4;
        var result = solution.maximizeSquareHoleArea(n, m, hBars, vBars);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int m = 1;
        int[] hBars = new int[]{2};
        int[] vBars = new int[]{2};
        int expected = 4;
        var result = solution.maximizeSquareHoleArea(n, m, hBars, vBars);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 2;
        int m = 3;
        int[] hBars = new int[]{2, 3};
        int[] vBars = new int[]{2, 3, 4};
        int expected = 9;
        var result = solution.maximizeSquareHoleArea(n, m, hBars, vBars);
        assertThat(result).isEqualTo(expected);
    }

}
