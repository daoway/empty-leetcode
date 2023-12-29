package com.blogspot.ostas.leetcode.all.hard.stickers_to_spell_word;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: stickers = ["with","example","science"], target = "thehat"
    Output: 3
    Explanation:
    We can use 2 "with" stickers, and 1 "example" sticker.
    After cutting and rearrange the letters of those stickers, we can form the target "thehat".
    Also, this is the minimum number of stickers necessary to form the target string.
    Example 2:
    Input: stickers = ["notice","possible"], target = "basicbasic"
    Output: -1
    Explanation:
    We cannot form the target "basicbasic" from cutting letters from the given stickers.
      Constraints:
    n == stickers.length
    1 <= n <= 50
    1 <= stickers[i].length <= 10
    1 <= target.length <= 15
    stickers[i] and target consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] stickers = new String[]{"with", "example", "science"};
        String target = "thehat";
        int expected = 3;
        var result = solution.minStickers(stickers, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] stickers = new String[]{"notice", "possible"};
        String target = "basicbasic";
        int expected = -1;
        var result = solution.minStickers(stickers, target);
        assertThat(result).isEqualTo(expected);
    }

}
