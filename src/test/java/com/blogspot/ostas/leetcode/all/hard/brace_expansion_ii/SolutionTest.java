package com.blogspot.ostas.leetcode.all.hard.brace_expansion_ii;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: expression = "{a,b}{c,{d,e}}"
    Output: ["ac","ad","ae","bc","bd","be"]
    Example 2:
    Input: expression = "{{a,z},a{b,c},{ab,z}}"
    Output: ["a","ab","ac","z"]
    Explanation: Each distinct word is written only once in the final answer.
      Constraints:
    1 <= expression.length <= 60
    expression[i] consists of '{', '}', ','or lowercase English letters.
    The given expression represents a set of words based on the grammar given in the description.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String expression = "{a,b}{c,{d,e}}";
        List<String> expected = List.of("ac", "ad", "ae", "bc", "bd", "be");
        var result = solution.braceExpansionII(expression);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String expression = "{{a,z},a{b,c},{ab,z}}";
        List<String> expected = List.of("a", "ab", "ac", "z");
        var result = solution.braceExpansionII(expression);
        assertThat(result).isEqualTo(expected);
    }

}
