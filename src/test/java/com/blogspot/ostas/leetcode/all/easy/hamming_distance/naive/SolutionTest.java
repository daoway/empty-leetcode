package com.blogspot.ostas.leetcode.all.easy.hamming_distance.naive;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: x = 1, y = 4
    Output: 2
    Explanation:
    1   (0 0 0 1)
    4   (0 1 0 0)
       ↑   ↑
    The above arrows point to positions where the corresponding bits are different.
    Example 2:
    Input: x = 3, y = 1
    Output: 1
      Constraints:
    0 <= x, y <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int x = 1;
        int y = 4;
        int expected = 2;
        var result = solution.hammingDistance(x, y);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int x = 3;
        int y = 1;
        int expected = 1;
        var result = solution.hammingDistance(x, y);
        assertThat(result).isEqualTo(expected);
    }

}
