package com.blogspot.ostas.leetcode.all.medium.minimum_fuel_cost_to_report_to_the_capital;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: roads = [[0,1],[0,2],[0,3]], seats = 5
    Output: 3
    Explanation:
    - Representative1 goes directly to the capital with 1 liter of fuel.
    - Representative2 goes directly to the capital with 1 liter of fuel.
    - Representative3 goes directly to the capital with 1 liter of fuel.
    It costs 3 liters of fuel at minimum.
    It can be proven that 3 is the minimum number of liters of fuel needed.
    Example 2:
    Input: roads = [[3,1],[3,2],[1,0],[0,4],[0,5],[4,6]], seats = 2
    Output: 7
    Explanation:
    - Representative2 goes directly to city 3 with 1 liter of fuel.
    - Representative2 and representative3 go together to city 1 with 1 liter of fuel.
    - Representative2 and representative3 go together to the capital with 1 liter of fuel.
    - Representative1 goes directly to the capital with 1 liter of fuel.
    - Representative5 goes directly to the capital with 1 liter of fuel.
    - Representative6 goes directly to city 4 with 1 liter of fuel.
    - Representative4 and representative6 go together to the capital with 1 liter of fuel.
    It costs 7 liters of fuel at minimum.
    It can be proven that 7 is the minimum number of liters of fuel needed.
    Example 3:
    Input: roads = [], seats = 1
    Output: 0
    Explanation: No representatives need to travel to the capital city.
      Constraints:
    1 <= n <= 105
    roads.length == n - 1
    roads[i].length == 2
    0 <= ai, bi < n
    ai != bi
    roads represents a valid tree.
    1 <= seats <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] roads = new int[][]{{0, 1}, {0, 2}, {0, 3}};
        int seats = 5;
        long expected = 3;
        var result = solution.minimumFuelCost(roads, seats);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] roads = new int[][]{{3, 1}, {3, 2}, {1, 0}, {0, 4}, {0, 5}, {4, 6}};
        int seats = 2;
        long expected = 7;
        var result = solution.minimumFuelCost(roads, seats);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] roads = new int[][]{};
        int seats = 1;
        long expected = 0;
        var result = solution.minimumFuelCost(roads, seats);
        assertThat(result).isEqualTo(expected);
    }

}
