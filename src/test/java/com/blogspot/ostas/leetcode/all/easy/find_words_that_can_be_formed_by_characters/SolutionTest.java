package com.blogspot.ostas.leetcode.all.easy.find_words_that_can_be_formed_by_characters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["cat","bt","hat","tree"], chars = "atach"
    Output: 6
    Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
    Example 2:
    Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
    Output: 10
    Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
      Constraints:
    1 <= words.length <= 1000
    1 <= words[i].length, chars.length <= 100
    words[i] and chars consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"cat", "bt", "hat", "tree"};
        String chars = "atach";
        int expected = 6;
        var result = solution.countCharacters(words, chars);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"hello", "world", "leetcode"};
        String chars = "welldonehoneyr";
        int expected = 10;
        var result = solution.countCharacters(words, chars);
        assertThat(result).isEqualTo(expected);
    }

}
