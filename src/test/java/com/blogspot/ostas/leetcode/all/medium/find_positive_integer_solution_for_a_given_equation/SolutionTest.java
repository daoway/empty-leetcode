package com.blogspot.ostas.leetcode.all.medium.find_positive_integer_solution_for_a_given_equation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: function_id = 1, z = 5
    Output: [[1,4],[2,3],[3,2],[4,1]]
    Explanation: The hidden formula for function_id = 1 is f(x, y) = x + y.
    The following positive integer values of x and y make f(x, y) equal to 5:
    x=1, y=4 -> f(1, 4) = 1 + 4 = 5.
    x=2, y=3 -> f(2, 3) = 2 + 3 = 5.
    x=3, y=2 -> f(3, 2) = 3 + 2 = 5.
    x=4, y=1 -> f(4, 1) = 4 + 1 = 5.
    Example 2:
    Input: function_id = 2, z = 5
    Output: [[1,5],[5,1]]
    Explanation: The hidden formula for function_id = 2 is f(x, y) = x * y.
    The following positive integer values of x and y make f(x, y) equal to 5:
    x=1, y=5 -> f(1, 5) = 1 * 5 = 5.
    x=5, y=1 -> f(5, 1) = 5 * 1 = 5.
      Constraints:
    1 <= function_id <= 9
    1 <= z <= 100
    It is guaranteed that the solutions of f(x, y) == z will be in the range 1 <= x, y <= 1000.
    It is also guaranteed that f(x, y) will fit in 32 bit signed integer if 1 <= x, y <= 1000.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        CustomFunction customfunction = null;
        int z = 5;
        List<List<Integer>> expected =
                List.of(List.of(1, 4), List.of(2, 3), List.of(3, 2), List.of(4, 1));
        var result = solution.findSolution(customfunction, z);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        CustomFunction customfunction = null;
        int z = 5;
        List<List<Integer>> expected = List.of(List.of(1, 5), List.of(5, 1));
        var result = solution.findSolution(customfunction, z);
        assertThat(result).isEqualTo(expected);
    }

}
