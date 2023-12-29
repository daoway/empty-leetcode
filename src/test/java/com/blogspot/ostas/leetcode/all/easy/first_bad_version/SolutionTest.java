package com.blogspot.ostas.leetcode.all.easy.first_bad_version;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class SolutionTest {

  /*
    Example 1:
  Input: n = 5, bad = 4
  Output: 4
  Explanation:
  call isBadVersion(3) -> false
  call isBadVersion(5) -> true
  call isBadVersion(4) -> true
  Then 4 is the first bad version.
  Example 2:
  Input: n = 1, bad = 1
  Output: 1
    Constraints:
  1 <= bad <= n <= 231 - 1
  */
  @Test
  void example_0() {
    var solution = new Solution();
    int n = 5;
    int expected = 4;
    var result = solution.firstBadVersion(n);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  void example_1() {
    var solution = new Solution();
    int n = 1;
    int expected = 1;
    var result = solution.firstBadVersion(n);
    assertThat(result).isEqualTo(expected);
  }

}
