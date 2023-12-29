package com.blogspot.ostas.leetcode.all.hard.minimum_cost_to_connect_two_groups_of_points;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: cost = [[15, 96], [36, 2]]
    Output: 17
    Explanation: The optimal way of connecting the groups is:
    1--A
    2--B
    This results in a total cost of 17.
    Example 2:
    Input: cost = [[1, 3, 5], [4, 1, 1], [1, 5, 3]]
    Output: 4
    Explanation: The optimal way of connecting the groups is:
    1--A
    2--B
    2--C
    3--A
    This results in a total cost of 4.
    Note that there are multiple points connected to point 2 in the first group and point A in the second group. This does not matter as there is no limit to the number of points that can be connected. We only care about the minimum total cost.
    Example 3:
    Input: cost = [[2, 5, 1], [3, 4, 7], [8, 1, 2], [6, 2, 4], [3, 8, 8]]
    Output: 10
      Constraints:
    size1 == cost.length
    size2 == cost[i].length
    1 <= size1, size2 <= 12
    size1 >= size2
    0 <= cost[i][j] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<Integer>> cost = List.of(List.of(15, 96), List.of(36, 2));
        int expected = 17;
        var result = solution.connectTwoGroups(cost);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<Integer>> cost = List.of(List.of(1, 3, 5), List.of(4, 1, 1), List.of(1, 5, 3));
        int expected = 4;
        var result = solution.connectTwoGroups(cost);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<List<Integer>> cost = List.of(List.of(2, 5, 1), List.of(3, 4, 7), List.of(8, 1, 2), List.of(6, 2, 4), List.of(3, 8, 8));
        int expected = 10;
        var result = solution.connectTwoGroups(cost);
        assertThat(result).isEqualTo(expected);
    }

}
