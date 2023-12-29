package com.blogspot.ostas.leetcode.all.easy.maximum_population_year;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: logs = [[1993,1999],[2000,2010]]
    Output: 1993
    Explanation: The maximum population is 1, and 1993 is the earliest year with this population.
    Example 2:
    Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
    Output: 1960
    Explanation:
    The maximum population is 2, and it had happened in years 1960 and 1970.
    The earlier year between them is 1960.
      Constraints:
    1 <= logs.length <= 100
    1950 <= birthi < deathi <= 2050
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] logs = new int[][]{{1993, 1999}, {2000, 2010}};
        int expected = 1993;
        var result = solution.maximumPopulation(logs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] logs = new int[][]{{1950, 1961}, {1960, 1971}, {1970, 1981}};
        int expected = 1960;
        var result = solution.maximumPopulation(logs);
        assertThat(result).isEqualTo(expected);
    }

}
