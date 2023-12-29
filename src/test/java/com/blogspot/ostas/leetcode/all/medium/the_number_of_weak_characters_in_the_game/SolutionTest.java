package com.blogspot.ostas.leetcode.all.medium.the_number_of_weak_characters_in_the_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: properties = [[5,5],[6,3],[3,6]]
    Output: 0
    Explanation: No character has strictly greater attack and defense than the other.
    Example 2:
    Input: properties = [[2,2],[3,3]]
    Output: 1
    Explanation: The first character is weak because the second character has a strictly greater attack and defense.
    Example 3:
    Input: properties = [[1,5],[10,4],[4,3]]
    Output: 1
    Explanation: The third character is weak because the second character has a strictly greater attack and defense.
      Constraints:
    2 <= properties.length <= 105
    properties[i].length == 2
    1 <= attacki, defensei <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] properties = new int[][]{{5, 5}, {6, 3}, {3, 6}};
        int expected = 0;
        var result = solution.numberOfWeakCharacters(properties);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] properties = new int[][]{{2, 2}, {3, 3}};
        int expected = 1;
        var result = solution.numberOfWeakCharacters(properties);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] properties = new int[][]{{1, 5}, {10, 4}, {4, 3}};
        int expected = 1;
        var result = solution.numberOfWeakCharacters(properties);
        assertThat(result).isEqualTo(expected);
    }

}
