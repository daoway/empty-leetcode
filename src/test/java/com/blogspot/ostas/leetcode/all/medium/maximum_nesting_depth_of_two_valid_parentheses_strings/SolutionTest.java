package com.blogspot.ostas.leetcode.all.medium.maximum_nesting_depth_of_two_valid_parentheses_strings;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  /*
    Example 1:
  Input: seq = "(()())"
  Output: [0,1,1,1,1,0]
  Example 2:
  Input: seq = "()(())()"
  Output: [0,0,0,1,1,0,1,1]
    Constraints:
  1 <= seq.size <= 10000
  */
  @Test
  void example_0() {
    var solution = new Solution();
    String seq = "(()())";
    int[] expected = new int[] {0, 1, 1, 1, 1, 0};
    var result = solution.maxDepthAfterSplit(seq);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  void example_1() {
    var solution = new Solution();
    String seq = "()(())()";
    int[] expected = new int[] {0, 0, 0, 1, 1, 0, 1, 1};
    var result = solution.maxDepthAfterSplit(seq);
    assertThat(result).isEqualTo(expected);
  }

}
