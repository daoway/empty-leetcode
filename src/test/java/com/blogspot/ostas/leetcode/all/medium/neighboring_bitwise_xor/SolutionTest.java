package com.blogspot.ostas.leetcode.all.medium.neighboring_bitwise_xor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: derived = [1,1,0]
    Output: true
    Explanation: A valid original array that gives derived is [0,1,0].
    derived[0] = original[0] ⊕ original[1] = 0 ⊕ 1 = 1
    derived[1] = original[1] ⊕ original[2] = 1 ⊕ 0 = 1
    derived[2] = original[2] ⊕ original[0] = 0 ⊕ 0 = 0
    Example 2:
    Input: derived = [1,1]
    Output: true
    Explanation: A valid original array that gives derived is [0,1].
    derived[0] = original[0] ⊕ original[1] = 1
    derived[1] = original[1] ⊕ original[0] = 1
    Example 3:
    Input: derived = [1,0]
    Output: false
    Explanation: There is no valid original array that gives derived.
      Constraints:
    n == derived.length
    1 <= n <= 105
    The values in derived are either 0's or 1's
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] derived = new int[]{1, 1, 0};
        boolean expected = true;
        var result = solution.doesValidArrayExist(derived);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] derived = new int[]{1, 1};
        boolean expected = true;
        var result = solution.doesValidArrayExist(derived);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] derived = new int[]{1, 0};
        boolean expected = false;
        var result = solution.doesValidArrayExist(derived);
        assertThat(result).isEqualTo(expected);
    }

}
