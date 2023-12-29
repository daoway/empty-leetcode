package com.blogspot.ostas.leetcode.all.medium.html_entity_parser;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: text = "&amp; is an HTML entity but &ambassador; is not."
    Output: "& is an HTML entity but &ambassador; is not."
    Explanation: The parser will replace the &amp; entity by &
    Example 2:
    Input: text = "and I quote: &quot;...&quot;"
    Output: "and I quote: \"...\""
      Constraints:
    1 <= text.length <= 105
    The string may contain any possible characters out of all the 256 ASCII characters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String text = "&amp; is an HTML entity but &ambassador; is not.";
        String expected = "& is an HTML entity but &ambassador; is not.";
        var result = solution.entityParser(text);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String text = "and I quote: &quot;...&quot;";
        String expected = "and I quote: \"...\"";
        var result = solution.entityParser(text);
        assertThat(result).isEqualTo(expected);
    }

}
