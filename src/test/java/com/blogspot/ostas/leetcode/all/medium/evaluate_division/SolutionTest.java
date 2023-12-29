package com.blogspot.ostas.leetcode.all.medium.evaluate_division;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: equations = [["a","b"],["b","c"]], values = [2.0,3.0], queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
    Output: [6.00000,0.50000,-1.00000,1.00000,-1.00000]
    Explanation:
    Given: a / b = 2.0, b / c = 3.0
    queries are: a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ?
    return: [6.0, 0.5, -1.0, 1.0, -1.0 ]
    note: x is undefined => -1.0
    Example 2:
    Input: equations = [["a","b"],["b","c"],["bc","cd"]], values = [1.5,2.5,5.0], queries = [["a","c"],["c","b"],["bc","cd"],["cd","bc"]]
    Output: [3.75000,0.40000,5.00000,0.20000]
    Example 3:
    Input: equations = [["a","b"]], values = [0.5], queries = [["a","b"],["b","a"],["a","c"],["x","y"]]
    Output: [0.50000,2.00000,-1.00000,-1.00000]
      Constraints:
    1 <= equations.length <= 20
    equations[i].length == 2
    1 <= Ai.length, Bi.length <= 5
    values.length == equations.length
    0.0 < values[i] <= 20.0
    1 <= queries.length <= 20
    queries[i].length == 2
    1 <= Cj.length, Dj.length <= 5
    Ai, Bi, Cj, Dj consist of lower case English letters and digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<String>> equations = List.of(List.of("a", "b"), List.of("b", "c"));
        double[] values = new double[]{2.0, 3.0};
        List<List<String>> queries =
                List.of(List.of("a", "c"), List.of("b", "a"), List.of("a", "e"), List.of("a", "a"),
                        List.of("x", "x"));
        double[] expected = new double[]{6.00000, 0.50000, -1.00000, 1.00000, -1.00000};
        var result = solution.calcEquation(equations, values, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<String>> equations =
                List.of(List.of("a", "b"), List.of("b", "c"), List.of("bc", "cd"));
        double[] values = new double[]{1.5, 2.5, 5.0};
        List<List<String>> queries = List.of(List.of("a", "c"), List.of("c", "b"), List.of("bc", "cd"),
                List.of("cd", "bc"));
        double[] expected = new double[]{3.75000, 0.40000, 5.00000, 0.20000};
        var result = solution.calcEquation(equations, values, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<List<String>> equations = List.of(List.of("a", "b"));
        double[] values = new double[]{0.5};
        List<List<String>> queries = List.of(List.of("a", "b"), List.of("b", "a"), List.of("a", "c"),
                List.of("x", "y"));
        double[] expected = new double[]{0.50000, 2.00000, -1.00000, -1.00000};
        var result = solution.calcEquation(equations, values, queries);
        assertThat(result).isEqualTo(expected);
    }

}
