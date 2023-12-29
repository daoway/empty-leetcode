package com.blogspot.ostas.leetcode.all.medium.maximum_total_importance_of_roads;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, roads = [[0,1],[1,2],[2,3],[0,2],[1,3],[2,4]]
    Output: 43
    Explanation: The figure above shows the country and the assigned values of [2,4,5,3,1].
    - The road (0,1) has an importance of 2 + 4 = 6.
    - The road (1,2) has an importance of 4 + 5 = 9.
    - The road (2,3) has an importance of 5 + 3 = 8.
    - The road (0,2) has an importance of 2 + 5 = 7.
    - The road (1,3) has an importance of 4 + 3 = 7.
    - The road (2,4) has an importance of 5 + 1 = 6.
    The total importance of all roads is 6 + 9 + 8 + 7 + 7 + 6 = 43.
    It can be shown that we cannot obtain a greater total importance than 43.
    Example 2:
    Input: n = 5, roads = [[0,3],[2,4],[1,3]]
    Output: 20
    Explanation: The figure above shows the country and the assigned values of [4,3,2,5,1].
    - The road (0,3) has an importance of 4 + 5 = 9.
    - The road (2,4) has an importance of 2 + 1 = 3.
    - The road (1,3) has an importance of 3 + 5 = 8.
    The total importance of all roads is 9 + 3 + 8 = 20.
    It can be shown that we cannot obtain a greater total importance than 20.
      Constraints:
    2 <= n <= 5 * 104
    1 <= roads.length <= 5 * 104
    roads[i].length == 2
    0 <= ai, bi <= n - 1
    ai != bi
    There are no duplicate roads.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int[][] roads = new int[][]{{0, 1}, {1, 2}, {2, 3}, {0, 2}, {1, 3}, {2, 4}};
        long expected = 43;
        var result = solution.maximumImportance(n, roads);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int[][] roads = new int[][]{{0, 3}, {2, 4}, {1, 3}};
        long expected = 20;
        var result = solution.maximumImportance(n, roads);
        assertThat(result).isEqualTo(expected);
    }

}
