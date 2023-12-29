package com.blogspot.ostas.leetcode.all.easy.greatest_english_letter_in_upper_and_lower_case;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "lEeTcOdE"
    Output: "E"
    Explanation:
    The letter 'E' is the only letter to appear in both lower and upper case.
    Example 2:
    Input: s = "arRAzFif"
    Output: "R"
    Explanation:
    The letter 'R' is the greatest letter to appear in both lower and upper case.
    Note that 'A' and 'F' also appear in both lower and upper case, but 'R' is greater than 'F' or 'A'.
    Example 3:
    Input: s = "AbCdEfGhIjK"
    Output: ""
    Explanation:
    There is no letter that appears in both lower and upper case.
      Constraints:
    1 <= s.length <= 1000
    s consists of lowercase and uppercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "lEeTcOdE";
        String expected = "E";
        var result = solution.greatestLetter(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "arRAzFif";
        String expected = "R";
        var result = solution.greatestLetter(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "AbCdEfGhIjK";
        String expected = "";
        var result = solution.greatestLetter(s);
        assertThat(result).isEqualTo(expected);
    }

}
