package com.blogspot.ostas.leetcode.all.hard.maximum_score_words_formed_by_letters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["dog","cat","dad","good"], letters = ["a","a","c","d","d","d","g","o","o"], score = [1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0]
    Output: 23
    Explanation:
    Score  a=1, c=9, d=5, g=3, o=2
    Given letters, we can form the words "dad" (5+1+5) and "good" (3+2+2+5) with a score of 23.
    Words "dad" and "dog" only get a score of 21.
    Example 2:
    Input: words = ["xxxz","ax","bx","cx"], letters = ["z","a","b","c","x","x","x"], score = [4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,10]
    Output: 27
    Explanation:
    Score  a=4, b=4, c=4, x=5, z=10
    Given letters, we can form the words "ax" (4+5), "bx" (4+5) and "cx" (4+5) with a score of 27.
    Word "xxxz" only get a score of 25.
    Example 3:
    Input: words = ["leetcode"], letters = ["l","e","t","c","o","d"], score = [0,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0]
    Output: 0
    Explanation:
    Letter "e" can only be used once.
      Constraints:
    1 <= words.length <= 14
    1 <= words[i].length <= 15
    1 <= letters.length <= 100
    letters[i].length == 1
    score.length == 26
    0 <= score[i] <= 10
    words[i], letters[i] contains only lower case English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"dog", "cat", "dad", "good"};
        char[] letters = new char[]{'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'};
        int[] score =
                new int[]{1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int expected = 23;
        var result = solution.maxScoreWords(words, letters, score);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"xxxz", "ax", "bx", "cx"};
        char[] letters = new char[]{'z', 'a', 'b', 'c', 'x', 'x', 'x'};
        int[] score =
                new int[]{4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 10};
        int expected = 27;
        var result = solution.maxScoreWords(words, letters, score);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] words = new String[]{"leetcode"};
        char[] letters = new char[]{'l', 'e', 't', 'c', 'o', 'd'};
        int[] score =
                new int[]{0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};
        int expected = 0;
        var result = solution.maxScoreWords(words, letters, score);
        assertThat(result).isEqualTo(expected);
    }

}
