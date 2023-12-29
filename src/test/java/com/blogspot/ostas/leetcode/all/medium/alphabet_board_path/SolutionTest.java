package com.blogspot.ostas.leetcode.all.medium.alphabet_board_path;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: target = "leet"
    Output: "DDR!UURRR!!DDD!"
    Example 2:
    Input: target = "code"
    Output: "RR!DDRR!UUL!R!"
      Constraints:
    1 <= target.length <= 100
    target consists only of English lowercase letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String target = "leet";
        String expected = "DDR!UURRR!!DDD!";
        var result = solution.alphabetBoardPath(target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String target = "code";
        String expected = "RR!DDRR!UUL!R!";
        var result = solution.alphabetBoardPath(target);
        assertThat(result).isEqualTo(expected);
    }

}
