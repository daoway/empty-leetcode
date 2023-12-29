package com.blogspot.ostas.leetcode.all.medium.minimum_length_of_string_after_deleting_similar_ends;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "ca"
    Output: 2
    Explanation: You can't remove any characters, so the string stays as is.
    Example 2:
    Input: s = "cabaabac"
    Output: 0
    Explanation: An optimal sequence of operations is:
    - Take prefix = "c" and suffix = "c" and remove them, s = "abaaba".
    - Take prefix = "a" and suffix = "a" and remove them, s = "baab".
    - Take prefix = "b" and suffix = "b" and remove them, s = "aa".
    - Take prefix = "a" and suffix = "a" and remove them, s = "".
    Example 3:
    Input: s = "aabccabba"
    Output: 3
    Explanation: An optimal sequence of operations is:
    - Take prefix = "aa" and suffix = "a" and remove them, s = "bccabb".
    - Take prefix = "b" and suffix = "bb" and remove them, s = "cca".
      Constraints:
    1 <= s.length <= 105
    s only consists of characters 'a', 'b', and 'c'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "ca";
        int expected = 2;
        var result = solution.minimumLength(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "cabaabac";
        int expected = 0;
        var result = solution.minimumLength(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "aabccabba";
        int expected = 3;
        var result = solution.minimumLength(s);
        assertThat(result).isEqualTo(expected);
    }

}
