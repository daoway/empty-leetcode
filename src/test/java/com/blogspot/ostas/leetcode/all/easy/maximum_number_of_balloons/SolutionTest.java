package com.blogspot.ostas.leetcode.all.easy.maximum_number_of_balloons;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: text = "nlaebolko"
    Output: 1
    Example 2:
    Input: text = "loonbalxballpoon"
    Output: 2
    Example 3:
    Input: text = "leetcode"
    Output: 0
      Constraints:
    1 <= text.length <= 104
    text consists of lower case English letters only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String text = "nlaebolko";
        int expected = 1;
        var result = solution.maxNumberOfBalloons(text);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String text = "loonbalxballpoon";
        int expected = 2;
        var result = solution.maxNumberOfBalloons(text);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String text = "leetcode";
        int expected = 0;
        var result = solution.maxNumberOfBalloons(text);
        assertThat(result).isEqualTo(expected);
    }

}
