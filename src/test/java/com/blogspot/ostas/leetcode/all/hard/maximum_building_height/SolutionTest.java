package com.blogspot.ostas.leetcode.all.hard.maximum_building_height;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, restrictions = [[2,1],[4,1]]
    Output: 2
    Explanation: The green area in the image indicates the maximum allowed height for each building.
    We can build the buildings with heights [0,1,2,1,2], and the tallest building has a height of 2.
    Example 2:
    Input: n = 6, restrictions = []
    Output: 5
    Explanation: The green area in the image indicates the maximum allowed height for each building.
    We can build the buildings with heights [0,1,2,3,4,5], and the tallest building has a height of 5.
    Example 3:
    Input: n = 10, restrictions = [[5,3],[2,5],[7,4],[10,3]]
    Output: 5
    Explanation: The green area in the image indicates the maximum allowed height for each building.
    We can build the buildings with heights [0,1,2,3,3,4,4,5,4,3], and the tallest building has a height of 5.
      Constraints:
    2 <= n <= 109
    0 <= restrictions.length <= min(n - 1, 105)
    2 <= idi <= n
    idi is unique.
    0 <= maxHeighti <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int[][] restrictions = new int[][]{{2, 1}, {4, 1}};
        int expected = 2;
        var result = solution.maxBuilding(n, restrictions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 6;
        int[][] restrictions = new int[][]{};
        int expected = 5;
        var result = solution.maxBuilding(n, restrictions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 10;
        int[][] restrictions = new int[][]{{5, 3}, {2, 5}, {7, 4}, {10, 3}};
        int expected = 5;
        var result = solution.maxBuilding(n, restrictions);
        assertThat(result).isEqualTo(expected);
    }

}
