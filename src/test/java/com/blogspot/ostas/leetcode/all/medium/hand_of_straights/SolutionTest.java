package com.blogspot.ostas.leetcode.all.medium.hand_of_straights;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
    Output: true
    Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]
    Example 2:
    Input: hand = [1,2,3,4,5], groupSize = 4
    Output: false
    Explanation: Alice's hand can not be rearranged into groups of 4.
      Constraints:
    1 <= hand.length <= 104
    0 <= hand[i] <= 109
    1 <= groupSize <= hand.length
      Note: This question is the same as 1296: https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] hand = new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize = 3;
        boolean expected = true;
        var result = solution.isNStraightHand(hand, groupSize);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] hand = new int[]{1, 2, 3, 4, 5};
        int groupSize = 4;
        boolean expected = false;
        var result = solution.isNStraightHand(hand, groupSize);
        assertThat(result).isEqualTo(expected);
    }

}
