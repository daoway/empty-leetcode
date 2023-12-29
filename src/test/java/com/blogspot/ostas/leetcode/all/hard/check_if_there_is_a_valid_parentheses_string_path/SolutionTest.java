package com.blogspot.ostas.leetcode.all.hard.check_if_there_is_a_valid_parentheses_string_path;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [["(","(","("],[")","(",")"],["(","(",")"],["(","(",")"]]
    Output: true
    Explanation: The above diagram shows two possible paths that form valid parentheses strings.
    The first path shown results in the valid parentheses string "()(())".
    The second path shown results in the valid parentheses string "((()))".
    Note that there may be other valid parentheses string paths.
    Example 2:
    Input: grid = [[")",")"],["(","("]]
    Output: false
    Explanation: The two possible paths form the parentheses strings "))(" and ")((". Since neither of them are valid parentheses strings, we return false.
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 100
    grid[i][j] is either '(' or ')'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        char[][] grid =
                new char[][]{{'(', '(', '('}, {')', '(', ')'}, {'(', '(', ')'}, {'(', '(', ')'}};
        boolean expected = true;
        var result = solution.hasValidPath(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        char[][] grid = new char[][]{{')', ')'}, {'(', '('}};
        boolean expected = false;
        var result = solution.hasValidPath(grid);
        assertThat(result).isEqualTo(expected);
    }

}
