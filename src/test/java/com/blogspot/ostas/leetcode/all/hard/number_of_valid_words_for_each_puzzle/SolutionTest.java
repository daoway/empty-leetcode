package com.blogspot.ostas.leetcode.all.hard.number_of_valid_words_for_each_puzzle;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["aaaa","asas","able","ability","actt","actor","access"], puzzles = ["aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"]
    Output: [1,1,3,2,4,0]
    Explanation:
    1 valid word for "aboveyz" : "aaaa"
    1 valid word for "abrodyz" : "aaaa"
    3 valid words for "abslute" : "aaaa", "asas", "able"
    2 valid words for "absoryz" : "aaaa", "asas"
    4 valid words for "actresz" : "aaaa", "asas", "actt", "access"
    There are no valid words for "gaswxyz" cause none of the words in the list contains letter 'g'.
    Example 2:
    Input: words = ["apple","pleas","please"], puzzles = ["aelwxyz","aelpxyz","aelpsxy","saelpxy","xaelpsy"]
    Output: [0,1,3,2,0]
      Constraints:
    1 <= words.length <= 105
    4 <= words[i].length <= 50
    1 <= puzzles.length <= 104
    puzzles[i].length == 7
    words[i] and puzzles[i] consist of lowercase English letters.
    Each puzzles[i] does not contain repeated characters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"aaaa", "asas", "able", "ability", "actt", "actor", "access"};
        String[] puzzles =
                new String[]{"aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"};
        List<Integer> expected = List.of(1, 1, 3, 2, 4, 0);
        var result = solution.findNumOfValidWords(words, puzzles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"apple", "pleas", "please"};
        String[] puzzles = new String[]{"aelwxyz", "aelpxyz", "aelpsxy", "saelpxy", "xaelpsy"};
        List<Integer> expected = List.of(0, 1, 3, 2, 0);
        var result = solution.findNumOfValidWords(words, puzzles);
        assertThat(result).isEqualTo(expected);
    }

}
