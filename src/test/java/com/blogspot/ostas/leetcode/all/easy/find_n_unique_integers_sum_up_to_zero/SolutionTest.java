package com.blogspot.ostas.leetcode.all.easy.find_n_unique_integers_sum_up_to_zero;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  /*
    Example 1:
  Input: n = 5
  Output: [-7,-1,1,3,4]
  Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
  Example 2:
  Input: n = 3
  Output: [-1,0,1]
  Example 3:
  Input: n = 1
  Output: [0]
    Constraints:
  1 <= n <= 1000
  */
  @Test
  void example_0() {
    var solution = new Solution();
    int n = 5;
    int[] expected = new int[] {-7, -1, 1, 3, 4};
    var result = solution.sumZero(n);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  void example_1() {
    var solution = new Solution();
    int n = 3;
    int[] expected = new int[] {-1, 0, 1};
    var result = solution.sumZero(n);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  void example_2() {
    var solution = new Solution();
    int n = 1;
    int[] expected = new int[] {0};
    var result = solution.sumZero(n);
    assertThat(result).isEqualTo(expected);
  }

}
