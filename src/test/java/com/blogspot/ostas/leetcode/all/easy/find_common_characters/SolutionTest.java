package com.blogspot.ostas.leetcode.all.easy.find_common_characters;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["bella","label","roller"]
    Output: ["e","l","l"]
    Example 2:
    Input: words = ["cool","lock","cook"]
    Output: ["c","o"]
      Constraints:
    1 <= words.length <= 100
    1 <= words[i].length <= 100
    words[i] consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"bella", "label", "roller"};
        List<String> expected = List.of("e", "l", "l");
        var result = solution.commonChars(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"cool", "lock", "cook"};
        List<String> expected = List.of("c", "o");
        var result = solution.commonChars(words);
        assertThat(result).isEqualTo(expected);
    }

}
