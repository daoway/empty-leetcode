package com.blogspot.ostas.leetcode.all.medium.minimum_path_cost_in_a_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[5,3],[4,0],[2,1]], moveCost = [[9,8],[1,5],[10,12],[18,6],[2,4],[14,3]]
    Output: 17
    Explanation: The path with the minimum possible cost is the path 5 -> 0 -> 1.
    - The sum of the values of cells visited is 5 + 0 + 1 = 6.
    - The cost of moving from 5 to 0 is 3.
    - The cost of moving from 0 to 1 is 8.
    So the total cost of the path is 6 + 3 + 8 = 17.
    Example 2:
    Input: grid = [[5,1,2],[4,0,3]], moveCost = [[12,10,15],[20,23,8],[21,7,1],[8,1,13],[9,10,25],[5,3,2]]
    Output: 6
    Explanation: The path with the minimum possible cost is the path 2 -> 3.
    - The sum of the values of cells visited is 2 + 3 = 5.
    - The cost of moving from 2 to 3 is 1.
    So the total cost of this path is 5 + 1 = 6.
      Constraints:
    m == grid.length
    n == grid[i].length
    2 <= m, n <= 50
    grid consists of distinct integers from 0 to m * n - 1.
    moveCost.length == m * n
    moveCost[i].length == n
    1 <= moveCost[i][j] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{5, 3}, {4, 0}, {2, 1}};
        int[][] moveCost = new int[][]{{9, 8}, {1, 5}, {10, 12}, {18, 6}, {2, 4}, {14, 3}};
        int expected = 17;
        var result = solution.minPathCost(grid, moveCost);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{5, 1, 2}, {4, 0, 3}};
        int[][] moveCost = new int[][]{{12, 10, 15}, {20, 23, 8}, {21, 7, 1}, {8, 1, 13}, {9, 10, 25},
                {5, 3, 2}};
        int expected = 6;
        var result = solution.minPathCost(grid, moveCost);
        assertThat(result).isEqualTo(expected);
    }

}
