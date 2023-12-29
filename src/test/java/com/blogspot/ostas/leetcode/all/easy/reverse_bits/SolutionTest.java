package com.blogspot.ostas.leetcode.all.easy.reverse_bits;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class SolutionTest {

  /*
    Example 1:
  Input: n = 00000010100101000001111010011100
  Output:    964176192 (00111001011110000010100101000000)
  Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, so return 964176192 which its binary representation is 00111001011110000010100101000000.
  Example 2:
  Input: n = 11111111111111111111111111111101
  Output:   3221225471 (10111111111111111111111111111111)
  Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293, so return 3221225471 which its binary representation is 10111111111111111111111111111111.
    Constraints:
  The input must be a binary string of length 32
    Follow up: If this function is called many times, how would you optimize it?
  */
  @Test
  void example_0() {
    var solution = new Solution();
    var n = new BigInteger("00000010100101000001111010011100");
    int expected = 964176192;
    var result = solution.reverseBits(n.intValue());
    assertThat(result).isEqualTo(expected);
  }

  @Test
  void example_1() {
    var solution = new Solution();
    var n = new BigInteger("11111111111111111111111111111101");
    int expected = new BigInteger("3221225471").intValue();
    var result = solution.reverseBits(n.intValue());
    assertThat(result).isEqualTo(expected);
  }

}
