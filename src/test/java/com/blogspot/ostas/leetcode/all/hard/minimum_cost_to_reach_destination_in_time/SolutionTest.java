package com.blogspot.ostas.leetcode.all.hard.minimum_cost_to_reach_destination_in_time;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: maxTime = 30, edges = [[0,1,10],[1,2,10],[2,5,10],[0,3,1],[3,4,10],[4,5,15]], passingFees = [5,1,2,20,20,3]
    Output: 11
    Explanation: The path to take is 0 -> 1 -> 2 -> 5, which takes 30 minutes and has $11 worth of passing fees.
    Example 2:
    Input: maxTime = 29, edges = [[0,1,10],[1,2,10],[2,5,10],[0,3,1],[3,4,10],[4,5,15]], passingFees = [5,1,2,20,20,3]
    Output: 48
    Explanation: The path to take is 0 -> 3 -> 4 -> 5, which takes 26 minutes and has $48 worth of passing fees.
    You cannot take path 0 -> 1 -> 2 -> 5 since it would take too long.
    Example 3:
    Input: maxTime = 25, edges = [[0,1,10],[1,2,10],[2,5,10],[0,3,1],[3,4,10],[4,5,15]], passingFees = [5,1,2,20,20,3]
    Output: -1
    Explanation: There is no way to reach city 5 from city 0 within 25 minutes.
      Constraints:
    1 <= maxTime <= 1000
    n == passingFees.length
    2 <= n <= 1000
    n - 1 <= edges.length <= 1000
    0 <= xi, yi <= n - 1
    1 <= timei <= 1000
    1 <= passingFees[j] <= 1000
    The graph may contain multiple edges between two nodes.
    The graph does not contain self loops.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int maxTime = 30;
        int[][] edges = new int[][]{{0, 1, 10}, {1, 2, 10}, {2, 5, 10}, {0, 3, 1}, {3, 4, 10},
                {4, 5, 15}};
        int[] passingFees = new int[]{5, 1, 2, 20, 20, 3};
        int expected = 11;
        var result = solution.minCost(maxTime, edges, passingFees);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int maxTime = 29;
        int[][] edges = new int[][]{{0, 1, 10}, {1, 2, 10}, {2, 5, 10}, {0, 3, 1}, {3, 4, 10},
                {4, 5, 15}};
        int[] passingFees = new int[]{5, 1, 2, 20, 20, 3};
        int expected = 48;
        var result = solution.minCost(maxTime, edges, passingFees);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int maxTime = 25;
        int[][] edges = new int[][]{{0, 1, 10}, {1, 2, 10}, {2, 5, 10}, {0, 3, 1}, {3, 4, 10},
                {4, 5, 15}};
        int[] passingFees = new int[]{5, 1, 2, 20, 20, 3};
        int expected = -1;
        var result = solution.minCost(maxTime, edges, passingFees);
        assertThat(result).isEqualTo(expected);
    }

}
