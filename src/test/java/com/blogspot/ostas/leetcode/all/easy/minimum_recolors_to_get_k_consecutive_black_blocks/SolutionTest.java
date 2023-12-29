package com.blogspot.ostas.leetcode.all.easy.minimum_recolors_to_get_k_consecutive_black_blocks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: blocks = "WBBWWBBWBW", k = 7
    Output: 3
    Explanation:
    One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
    so that blocks = "BBBBBBBWBW".
    It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
    Therefore, we return 3.
    Example 2:
    Input: blocks = "WBWBBBW", k = 2
    Output: 0
    Explanation:
    No changes need to be made, since 2 consecutive black blocks already exist.
    Therefore, we return 0.
      Constraints:
    n == blocks.length
    1 <= n <= 100
    blocks[i] is either 'W' or 'B'.
    1 <= k <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String blocks = "WBBWWBBWBW";
        int k = 7;
        int expected = 3;
        var result = solution.minimumRecolors(blocks, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String blocks = "WBWBBBW";
        int k = 2;
        int expected = 0;
        var result = solution.minimumRecolors(blocks, k);
        assertThat(result).isEqualTo(expected);
    }

}
