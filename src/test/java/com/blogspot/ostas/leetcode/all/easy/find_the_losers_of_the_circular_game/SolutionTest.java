package com.blogspot.ostas.leetcode.all.easy.find_the_losers_of_the_circular_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, k = 2
    Output: [4,5]
    Explanation: The game goes as follows:
    1) Start at 1st friend and pass the ball to the friend who is 2 steps away from them - 3rd friend.
    2) 3rd friend passes the ball to the friend who is 4 steps away from them - 2nd friend.
    3) 2nd friend passes the ball to the friend who is 6 steps away from them  - 3rd friend.
    4) The game ends as 3rd friend receives the ball for the second time.
    Example 2:
    Input: n = 4, k = 4
    Output: [2,3,4]
    Explanation: The game goes as follows:
    1) Start at the 1st friend and pass the ball to the friend who is 4 steps away from them - 1st friend.
    2) The game ends as 1st friend receives the ball for the second time.
      Constraints:
    1 <= k <= n <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int k = 2;
        int[] expected = new int[]{4, 5};
        var result = solution.circularGameLosers(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int k = 4;
        int[] expected = new int[]{2, 3, 4};
        var result = solution.circularGameLosers(n, k);
        assertThat(result).isEqualTo(expected);
    }

}
