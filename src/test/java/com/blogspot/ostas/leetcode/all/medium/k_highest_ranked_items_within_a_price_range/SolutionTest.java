package com.blogspot.ostas.leetcode.all.medium.k_highest_ranked_items_within_a_price_range;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,2,0,1],[1,3,0,1],[0,2,5,1]], pricing = [2,5], start = [0,0], k = 3
    Output: [[0,1],[1,1],[2,1]]
    Explanation: You start at (0,0).
    With a price range of [2,5], we can take items from (0,1), (1,1), (2,1) and (2,2).
    The ranks of these items are:
    - (0,1) with distance 1
    - (1,1) with distance 2
    - (2,1) with distance 3
    - (2,2) with distance 4
    Thus, the 3 highest ranked items in the price range are (0,1), (1,1), and (2,1).
    Example 2:
    Input: grid = [[1,2,0,1],[1,3,3,1],[0,2,5,1]], pricing = [2,3], start = [2,3], k = 2
    Output: [[2,1],[1,2]]
    Explanation: You start at (2,3).
    With a price range of [2,3], we can take items from (0,1), (1,1), (1,2) and (2,1).
    The ranks of these items are:
    - (2,1) with distance 2, price 2
    - (1,2) with distance 2, price 3
    - (1,1) with distance 3
    - (0,1) with distance 4
    Thus, the 2 highest ranked items in the price range are (2,1) and (1,2).
    Example 3:
    Input: grid = [[1,1,1],[0,0,1],[2,3,4]], pricing = [2,3], start = [0,0], k = 3
    Output: [[2,1],[2,0]]
    Explanation: You start at (0,0).
    With a price range of [2,3], we can take items from (2,0) and (2,1).
    The ranks of these items are:
    - (2,1) with distance 5
    - (2,0) with distance 6
    Thus, the 2 highest ranked items in the price range are (2,1) and (2,0).
    Note that k = 3 but there are only 2 reachable items within the price range.
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 105
    1 <= m * n <= 105
    0 <= grid[i][j] <= 105
    pricing.length == 2
    2 <= low <= high <= 105
    start.length == 2
    0 <= row <= m - 1
    0 <= col <= n - 1
    grid[row][col] > 0
    1 <= k <= m * n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 2, 0, 1}, {1, 3, 0, 1}, {0, 2, 5, 1}};
        int[] pricing = new int[]{2, 5};
        int[] start = new int[]{0, 0};
        int k = 3;
        List<List<Integer>> expected = List.of(List.of(0, 1), List.of(1, 1), List.of(2, 1));
        var result = solution.highestRankedKItems(grid, pricing, start, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 2, 0, 1}, {1, 3, 3, 1}, {0, 2, 5, 1}};
        int[] pricing = new int[]{2, 3};
        int[] start = new int[]{2, 3};
        int k = 2;
        List<List<Integer>> expected = List.of(List.of(2, 1), List.of(1, 2));
        var result = solution.highestRankedKItems(grid, pricing, start, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1, 1}, {0, 0, 1}, {2, 3, 4}};
        int[] pricing = new int[]{2, 3};
        int[] start = new int[]{0, 0};
        int k = 3;
        List<List<Integer>> expected = List.of(List.of(2, 1), List.of(2, 0));
        var result = solution.highestRankedKItems(grid, pricing, start, k);
        assertThat(result).isEqualTo(expected);
    }

}
