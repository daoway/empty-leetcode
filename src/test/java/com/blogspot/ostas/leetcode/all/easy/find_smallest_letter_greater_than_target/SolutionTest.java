package com.blogspot.ostas.leetcode.all.easy.find_smallest_letter_greater_than_target;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: letters = ["c","f","j"], target = "a"
    Output: "c"
    Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
    Example 2:
    Input: letters = ["c","f","j"], target = "c"
    Output: "f"
    Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
    Example 3:
    Input: letters = ["x","x","y","y"], target = "z"
    Output: "x"
    Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
      Constraints:
    2 <= letters.length <= 104
    letters[i] is a lowercase English letter.
    letters is sorted in non-decreasing order.
    letters contains at least two different characters.
    target is a lowercase English letter.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        char[] letters = new char[]{'c', 'f', 'j'};
        char target = 'a';
        char expected = 'c';
        var result = solution.nextGreatestLetter(letters, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        char[] letters = new char[]{'c', 'f', 'j'};
        char target = 'c';
        char expected = 'f';
        var result = solution.nextGreatestLetter(letters, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        char[] letters = new char[]{'x', 'x', 'y', 'y'};
        char target = 'z';
        char expected = 'x';
        var result = solution.nextGreatestLetter(letters, target);
        assertThat(result).isEqualTo(expected);
    }

}
