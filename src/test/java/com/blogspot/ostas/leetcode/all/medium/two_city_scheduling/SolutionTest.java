package com.blogspot.ostas.leetcode.all.medium.two_city_scheduling;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: costs = [[10,20],[30,200],[400,50],[30,20]]
    Output: 110
    Explanation:
    The first person goes to city A for a cost of 10.
    The second person goes to city A for a cost of 30.
    The third person goes to city B for a cost of 50.
    The fourth person goes to city B for a cost of 20.

    The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
    Example 2:
    Input: costs = [[259,770],[448,54],[926,667],[184,139],[840,118],[577,469]]
    Output: 1859
    Example 3:
    Input: costs = [[515,563],[451,713],[537,709],[343,819],[855,779],[457,60],[650,359],[631,42]]
    Output: 3086
      Constraints:
    2 * n == costs.length
    2 <= costs.length <= 100
    costs.length is even.
    1 <= aCosti, bCosti <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] costs = new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        int expected = 110;
        var result = solution.twoCitySchedCost(costs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] costs = new int[][]{{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118},
                {577, 469}};
        int expected = 1859;
        var result = solution.twoCitySchedCost(costs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] costs =
                new int[][]{{515, 563}, {451, 713}, {537, 709}, {343, 819}, {855, 779}, {457, 60},
                        {650, 359}, {631, 42}};
        int expected = 3086;
        var result = solution.twoCitySchedCost(costs);
        assertThat(result).isEqualTo(expected);
    }

}
