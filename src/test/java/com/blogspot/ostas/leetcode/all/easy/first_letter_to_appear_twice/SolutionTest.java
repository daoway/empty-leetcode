package com.blogspot.ostas.leetcode.all.easy.first_letter_to_appear_twice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abccbaacz"
    Output: "c"
    Explanation:
    The letter 'a' appears on the indexes 0, 5 and 6.
    The letter 'b' appears on the indexes 1 and 4.
    The letter 'c' appears on the indexes 2, 3 and 7.
    The letter 'z' appears on the index 8.
    The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.
    Example 2:
    Input: s = "abcdd"
    Output: "d"
    Explanation:
    The only letter that appears twice is 'd' so we return 'd'.
      Constraints:
    2 <= s.length <= 100
    s consists of lowercase English letters.
    s has at least one repeated letter.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abccbaacz";
        char expected = 'c';
        var result = solution.repeatedCharacter(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcdd";
        char expected = 'd';
        var result = solution.repeatedCharacter(s);
        assertThat(result).isEqualTo(expected);
    }

}
