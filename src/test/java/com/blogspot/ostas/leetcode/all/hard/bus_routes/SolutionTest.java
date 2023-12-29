package com.blogspot.ostas.leetcode.all.hard.bus_routes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: routes = [[1,2,7],[3,6,7]], source = 1, target = 6
    Output: 2
    Explanation: The best strategy is take the first bus to the bus stop 7, then take the second bus to the bus stop 6.
    Example 2:
    Input: routes = [[7,12],[4,5,15],[6],[15,19],[9,12,13]], source = 15, target = 12
    Output: -1
    Constraints:
    1 <= routes.length <= 500.
    1 <= routes[i].length <= 105
    All the values of routes[i] are unique.
    sum(routes[i].length) <= 105
    0 <= routes[i][j] < 106
    0 <= source, target < 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] routes = new int[][]{{1, 2, 7}, {3, 6, 7}};
        int source = 1;
        int target = 6;
        int expected = 2;
        var result = solution.numBusesToDestination(routes, source, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] routes = new int[][]{{7, 12}, {4, 5, 15}, {6}, {15, 19}, {9, 12, 13}};
        int source = 15;
        int target = 12;
        int expected = -1;
        var result = solution.numBusesToDestination(routes, source, target);
        assertThat(result).isEqualTo(expected);
    }

}
