package com.blogspot.ostas.leetcode.all.easy.goal_parser_interpretation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: command = "G()(al)"
    Output: "Goal"
    Explanation: The Goal Parser interprets the command as follows:
    G -> G
    () -> o
    (al) -> al
    The final concatenated result is "Goal".
    Example 2:
    Input: command = "G()()()()(al)"
    Output: "Gooooal"
    Example 3:
    Input: command = "(al)G(al)()()G"
    Output: "alGalooG"
      Constraints:
    1 <= command.length <= 100
    command consists of "G", "()", and/or "(al)" in some order.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String command = "G()(al)";
        String expected = "Goal";
        var result = solution.interpret(command);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String command = "G()()()()(al)";
        String expected = "Gooooal";
        var result = solution.interpret(command);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String command = "(al)G(al)()()G";
        String expected = "alGalooG";
        var result = solution.interpret(command);
        assertThat(result).isEqualTo(expected);
    }

}
