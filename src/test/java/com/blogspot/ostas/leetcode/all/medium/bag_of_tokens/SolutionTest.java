package com.blogspot.ostas.leetcode.all.medium.bag_of_tokens;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: tokens = [100], power = 50
    Output: 0
    Explanation: Playing the only token in the bag is impossible because you either have too little power or too little score.
    Example 2:
    Input: tokens = [100,200], power = 150
    Output: 1
    Explanation: Play the 0th token (100) face up, your power becomes 50 and score becomes 1.
    There is no need to play the 1st token since you cannot play it face up to add to your score.
    Example 3:
    Input: tokens = [100,200,300,400], power = 200
    Output: 2
    Explanation: Play the tokens in this order to get a score of 2:
    1. Play the 0th token (100) face up, your power becomes 100 and score becomes 1.
    2. Play the 3rd token (400) face down, your power becomes 500 and score becomes 0.
    3. Play the 1st token (200) face up, your power becomes 300 and score becomes 1.
    4. Play the 2nd token (300) face up, your power becomes 0 and score becomes 2.
      Constraints:
    0 <= tokens.length <= 1000
    0 <= tokens[i], power < 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] tokens = new int[]{100};
        int power = 50;
        int expected = 0;
        var result = solution.bagOfTokensScore(tokens, power);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] tokens = new int[]{100, 200};
        int power = 150;
        int expected = 1;
        var result = solution.bagOfTokensScore(tokens, power);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] tokens = new int[]{100, 200, 300, 400};
        int power = 200;
        int expected = 2;
        var result = solution.bagOfTokensScore(tokens, power);
        assertThat(result).isEqualTo(expected);
    }

}
