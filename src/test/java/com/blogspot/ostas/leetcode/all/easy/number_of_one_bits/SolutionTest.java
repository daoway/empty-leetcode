package com.blogspot.ostas.leetcode.all.easy.number_of_one_bits;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class SolutionTest {

  /*
    Example 1:
  Input: n = 00000000000000000000000000001011
  Output: 3
  Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
  Example 2:
  Input: n = 00000000000000000000000010000000
  Output: 1
  Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
  Example 3:
  Input: n = 11111111111111111111111111111101
  Output: 31
  Explanation: The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.
    Constraints:
  The input must be a binary string of length 32.
    Follow up: If this function is called many times, how would you optimize it?
  */
  @Test
  void example_0() {
    var solution = new Solution();
    int n = 00000000000000000000000000001011;
    int expected = 3;
    var result = solution.hammingWeight(n);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  void example_1() {
    var solution = new Solution();
    int n = 00000000000000000000000010000000;
    int expected = 1;
    var result = solution.hammingWeight(n);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  void example_2() {
    var solution = new Solution();
    var n = new BigInteger("11111111111111111111111111111101");
    int expected = 31;
    var result = solution.hammingWeight(n.intValue());
    assertThat(result).isEqualTo(expected);
  }

}
