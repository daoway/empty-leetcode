package com.blogspot.ostas.leetcode.all.easy.capitalize_the_title;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: title = "capiTalIze tHe titLe"
    Output: "Capitalize The Title"
    Explanation:
    Since all the words have a length of at least 3, the first letter of each word is uppercase, and the remaining letters are lowercase.
    Example 2:
    Input: title = "First leTTeR of EACH Word"
    Output: "First Letter of Each Word"
    Explanation:
    The word "of" has length 2, so it is all lowercase.
    The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.
    Example 3:
    Input: title = "i lOve leetcode"
    Output: "i Love Leetcode"
    Explanation:
    The word "i" has length 1, so it is lowercase.
    The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.
      Constraints:
    1 <= title.length <= 100
    title consists of words separated by a single space without any leading or trailing spaces.
    Each word consists of uppercase and lowercase English letters and is non-empty.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String title = "capiTalIze tHe titLe";
        String expected = "Capitalize The Title";
        var result = solution.capitalizeTitle(title);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String title = "First leTTeR of EACH Word";
        String expected = "First Letter of Each Word";
        var result = solution.capitalizeTitle(title);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String title = "i lOve leetcode";
        String expected = "i Love Leetcode";
        var result = solution.capitalizeTitle(title);
        assertThat(result).isEqualTo(expected);
    }

}
