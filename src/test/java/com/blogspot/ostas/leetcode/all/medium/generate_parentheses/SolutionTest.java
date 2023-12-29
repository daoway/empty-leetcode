package com.blogspot.ostas.leetcode.all.medium.generate_parentheses;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

  /*
    Example 1:
  Input: n = 3
  Output: ["((()))","(()())","(())()","()(())","()()()"]
  Example 2:
  Input: n = 1
  Output: ["()"]
    Constraints:
  1 <= n <= 8
  */
  @Test
  void example_0() {
    var solution = new Solution();
    int n = 3;
    List<String> expected = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
    var result = solution.generateParenthesis(n);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  void example_1() {
    var solution = new Solution();
    int n = 1;
    List<String> expected = List.of("()");
    var result = solution.generateParenthesis(n);
    assertThat(result).isEqualTo(expected);
  }

}
