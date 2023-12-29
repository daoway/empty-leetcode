package com.blogspot.ostas.leetcode.all.easy.percentage_of_letter_in_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "foobar", letter = "o"
    Output: 33
    Explanation:
    The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, so we return 33.
    Example 2:
    Input: s = "jjjj", letter = "k"
    Output: 0
    Explanation:
    The percentage of characters in s that equal the letter 'k' is 0%, so we return 0.
      Constraints:
    1 <= s.length <= 100
    s consists of lowercase English letters.
    letter is a lowercase English letter.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "foobar";
        char letter = 'o';
        int expected = 33;
        var result = solution.percentageLetter(s, letter);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "jjjj";
        char letter = 'k';
        int expected = 0;
        var result = solution.percentageLetter(s, letter);
        assertThat(result).isEqualTo(expected);
    }

}
