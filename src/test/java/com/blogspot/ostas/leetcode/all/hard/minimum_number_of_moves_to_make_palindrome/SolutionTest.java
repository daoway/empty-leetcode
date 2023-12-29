package com.blogspot.ostas.leetcode.all.hard.minimum_number_of_moves_to_make_palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aabb"
    Output: 2
    Explanation:
    We can obtain two palindromes from s, "abba" and "baab".
    - We can obtain "abba" from s in 2 moves: "aabb" -> "abab" -> "abba".
    - We can obtain "baab" from s in 2 moves: "aabb" -> "abab" -> "baab".
    Thus, the minimum number of moves needed to make s a palindrome is 2.
    Example 2:
    Input: s = "letelt"
    Output: 2
    Explanation:
    One of the palindromes we can obtain from s in 2 moves is "lettel".
    One of the ways we can obtain it is "letelt" -> "letetl" -> "lettel".
    Other palindromes such as "tleelt" can also be obtained in 2 moves.
    It can be shown that it is not possible to obtain a palindrome in less than 2 moves.
      Constraints:
    1 <= s.length <= 2000
    s consists only of lowercase English letters.
    s can be converted to a palindrome using a finite number of moves.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aabb";
        int expected = 2;
        var result = solution.minMovesToMakePalindrome(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "letelt";
        int expected = 2;
        var result = solution.minMovesToMakePalindrome(s);
        assertThat(result).isEqualTo(expected);
    }

}
