package com.blogspot.ostas.leetcode.all.medium.rabbits_in_forest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: answers = [1,1,2]
    Output: 5
    Explanation:
    The two rabbits that answered "1" could both be the same color, say red.
    The rabbit that answered "2" can't be red or the answers would be inconsistent.
    Say the rabbit that answered "2" was blue.
    Then there should be 2 other blue rabbits in the forest that didn't answer into the array.
    The smallest possible number of rabbits in the forest is therefore 5: 3 that answered plus 2 that didn't.
    Example 2:
    Input: answers = [10,10,10]
    Output: 11
      Constraints:
    1 <= answers.length <= 1000
    0 <= answers[i] < 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] answers = new int[]{1, 1, 2};
        int expected = 5;
        var result = solution.numRabbits(answers);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] answers = new int[]{10, 10, 10};
        int expected = 11;
        var result = solution.numRabbits(answers);
        assertThat(result).isEqualTo(expected);
    }

}
