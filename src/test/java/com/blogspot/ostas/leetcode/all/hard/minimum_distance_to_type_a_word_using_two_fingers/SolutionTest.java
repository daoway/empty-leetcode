package com.blogspot.ostas.leetcode.all.hard.minimum_distance_to_type_a_word_using_two_fingers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word = "CAKE"
    Output: 3
    Explanation: Using two fingers, one optimal way to type "CAKE" is:
    Finger 1 on letter 'C' -> cost = 0
    Finger 1 on letter 'A' -> cost = Distance from letter 'C' to letter 'A' = 2
    Finger 2 on letter 'K' -> cost = 0
    Finger 2 on letter 'E' -> cost = Distance from letter 'K' to letter 'E' = 1
    Total distance = 3
    Example 2:
    Input: word = "HAPPY"
    Output: 6
    Explanation: Using two fingers, one optimal way to type "HAPPY" is:
    Finger 1 on letter 'H' -> cost = 0
    Finger 1 on letter 'A' -> cost = Distance from letter 'H' to letter 'A' = 2
    Finger 2 on letter 'P' -> cost = 0
    Finger 2 on letter 'P' -> cost = Distance from letter 'P' to letter 'P' = 0
    Finger 1 on letter 'Y' -> cost = Distance from letter 'A' to letter 'Y' = 4
    Total distance = 6
      Constraints:
    2 <= word.length <= 300
    word consists of uppercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word = "CAKE";
        int expected = 3;
        var result = solution.minimumDistance(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word = "HAPPY";
        int expected = 6;
        var result = solution.minimumDistance(word);
        assertThat(result).isEqualTo(expected);
    }

}
