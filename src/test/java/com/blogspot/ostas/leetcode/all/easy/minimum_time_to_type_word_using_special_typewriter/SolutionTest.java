package com.blogspot.ostas.leetcode.all.easy.minimum_time_to_type_word_using_special_typewriter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word = "abc"
    Output: 5
    Explanation:
    The characters are printed as follows:
    - Type the character 'a' in 1 second since the pointer is initially on 'a'.
    - Move the pointer clockwise to 'b' in 1 second.
    - Type the character 'b' in 1 second.
    - Move the pointer clockwise to 'c' in 1 second.
    - Type the character 'c' in 1 second.
    Example 2:
    Input: word = "bza"
    Output: 7
    Explanation:
    The characters are printed as follows:
    - Move the pointer clockwise to 'b' in 1 second.
    - Type the character 'b' in 1 second.
    - Move the pointer counterclockwise to 'z' in 2 seconds.
    - Type the character 'z' in 1 second.
    - Move the pointer clockwise to 'a' in 1 second.
    - Type the character 'a' in 1 second.
    Example 3:
    Input: word = "zjpc"
    Output: 34
    Explanation:
    The characters are printed as follows:
    - Move the pointer counterclockwise to 'z' in 1 second.
    - Type the character 'z' in 1 second.
    - Move the pointer clockwise to 'j' in 10 seconds.
    - Type the character 'j' in 1 second.
    - Move the pointer clockwise to 'p' in 6 seconds.
    - Type the character 'p' in 1 second.
    - Move the pointer counterclockwise to 'c' in 13 seconds.
    - Type the character 'c' in 1 second.
      Constraints:
    1 <= word.length <= 100
    word consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word = "abc";
        int expected = 5;
        var result = solution.minTimeToType(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word = "bza";
        int expected = 7;
        var result = solution.minTimeToType(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String word = "zjpc";
        int expected = 34;
        var result = solution.minTimeToType(word);
        assertThat(result).isEqualTo(expected);
    }

}
