package com.blogspot.ostas.leetcode.all.medium.satisfiability_of_equality_equations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: equations = ["a==b","b!=a"]
    Output: false
    Explanation: If we assign say, a = 1 and b = 1, then the first equation is satisfied, but not the second.
    There is no way to assign the variables to satisfy both equations.
    Example 2:
    Input: equations = ["b==a","a==b"]
    Output: true
    Explanation: We could assign a = 1 and b = 1 to satisfy both equations.
      Constraints:
    1 <= equations.length <= 500
    equations[i].length == 4
    equations[i][0] is a lowercase letter.
    equations[i][1] is either '=' or '!'.
    equations[i][2] is '='.
    equations[i][3] is a lowercase letter.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] equations = new String[]{"a==b", "b!=a"};
        boolean expected = false;
        var result = solution.equationsPossible(equations);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] equations = new String[]{"b==a", "a==b"};
        boolean expected = true;
        var result = solution.equationsPossible(equations);
        assertThat(result).isEqualTo(expected);
    }

}
