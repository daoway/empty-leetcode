package com.blogspot.ostas.leetcode.all.easy.jewels_and_stones;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: jewels = "aA", stones = "aAAbbbb"
    Output: 3
    Example 2:
    Input: jewels = "z", stones = "ZZ"
    Output: 0
      Constraints:
    1 <= jewels.length, stones.length <= 50
    jewels and stones consist of only English letters.
    All the characters of jewels are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        var result = solution.numJewelsInStones(jewels, stones);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String jewels = "z";
        String stones = "ZZ";
        int expected = 0;
        var result = solution.numJewelsInStones(jewels, stones);
        assertThat(result).isEqualTo(expected);
    }

}
