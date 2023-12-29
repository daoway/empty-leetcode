package com.blogspot.ostas.leetcode.all.medium.predict_the_winner;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,5,2]
    Output: false
    Explanation: Initially, player 1 can choose between 1 and 2.
    If he chooses 2 (or 1), then player 2 can choose from 1 (or 2) and 5. If player 2 chooses 5, then player 1 will be left with 1 (or 2).
    So, final score of player 1 is 1 + 2 = 3, and player 2 is 5.
    Hence, player 1 will never be the winner and you need to return false.
    Example 2:
    Input: nums = [1,5,233,7]
    Output: true
    Explanation: Player 1 first chooses 1. Then player 2 has to choose between 5 and 7. No matter which number player 2 choose, player 1 can choose 233.
    Finally, player 1 has more score (234) than player 2 (12), so you need to return True representing player1 can win.
      Constraints:
    1 <= nums.length <= 20
    0 <= nums[i] <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 5, 2};
        boolean expected = false;
        var result = solution.predictTheWinner(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 5, 233, 7};
        boolean expected = true;
        var result = solution.predictTheWinner(nums);
        assertThat(result).isEqualTo(expected);
    }

}
