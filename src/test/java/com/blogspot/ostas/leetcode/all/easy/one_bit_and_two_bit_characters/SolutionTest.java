package com.blogspot.ostas.leetcode.all.easy.one_bit_and_two_bit_characters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: bits = [1,0,0]
    Output: true
    Explanation: The only way to decode it is two-bit character and one-bit character.
    So the last character is one-bit character.
    Example 2:
    Input: bits = [1,1,1,0]
    Output: false
    Explanation: The only way to decode it is two-bit character and two-bit character.
    So the last character is not one-bit character.
      Constraints:
    1 <= bits.length <= 1000
    bits[i] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] bits = new int[]{1, 0, 0};
        boolean expected = true;
        var result = solution.isOneBitCharacter(bits);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] bits = new int[]{1, 1, 1, 0};
        boolean expected = false;
        var result = solution.isOneBitCharacter(bits);
        assertThat(result).isEqualTo(expected);
    }

}
