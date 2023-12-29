package com.blogspot.ostas.leetcode.all.medium.vowel_spellchecker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: wordlist = ["KiTe","kite","hare","Hare"], queries = ["kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"]
    Output: ["kite","KiTe","KiTe","Hare","hare","","","KiTe","","KiTe"]
    Example 2:
    Input: wordlist = ["yellow"], queries = ["YellOw"]
    Output: ["yellow"]
      Constraints:
    1 <= wordlist.length, queries.length <= 5000
    1 <= wordlist[i].length, queries[i].length <= 7
    wordlist[i] and queries[i] consist only of only English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] wordlist = new String[]{"KiTe", "kite", "hare", "Hare"};
        String[] queries =
                new String[]{"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet",
                        "keto"};
        String[] expected =
                new String[]{"kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe"};
        var result = solution.spellchecker(wordlist, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] wordlist = new String[]{"yellow"};
        String[] queries = new String[]{"YellOw"};
        String[] expected = new String[]{"yellow"};
        var result = solution.spellchecker(wordlist, queries);
        assertThat(result).isEqualTo(expected);
    }

}
