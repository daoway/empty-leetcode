package com.blogspot.ostas.leetcode.all.medium.maximum_points_you_can_obtain_from_cards;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: cardPoints = [1,2,3,4,5,6,1], k = 3
    Output: 12
    Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.
    Example 2:
    Input: cardPoints = [2,2,2], k = 2
    Output: 4
    Explanation: Regardless of which two cards you take, your score will always be 4.
    Example 3:
    Input: cardPoints = [9,7,7,9,7,7,9], k = 7
    Output: 55
    Explanation: You have to take all the cards. Your score is the sum of points of all cards.
      Constraints:
    1 <= cardPoints.length <= 105
    1 <= cardPoints[i] <= 104
    1 <= k <= cardPoints.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] cardPoints = new int[]{1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        int expected = 12;
        var result = solution.maxScore(cardPoints, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] cardPoints = new int[]{2, 2, 2};
        int k = 2;
        int expected = 4;
        var result = solution.maxScore(cardPoints, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] cardPoints = new int[]{9, 7, 7, 9, 7, 7, 9};
        int k = 7;
        int expected = 55;
        var result = solution.maxScore(cardPoints, k);
        assertThat(result).isEqualTo(expected);
    }

}
