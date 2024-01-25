package com.blogspot.ostas.leetcode.all.hard.stone_game_iii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: stoneValue = [1,2,3,7]
    Output: "Bob"
    Explanation: Alice will always lose. Her best move will be to take three piles and the score become 6. Now the score of Bob is 7 and Bob wins.
    Example 2:
    Input: stoneValue = [1,2,3,-9]
    Output: "Alice"
    Explanation: Alice must choose all the three piles at the first move to win and leave Bob with negative score.
    If Alice chooses one pile her score will be 1 and the next move Bob's score becomes 5. In the next move, Alice will take the pile with value = -9 and lose.
    If Alice chooses two piles her score will be 3 and the next move Bob's score becomes 3. In the next move, Alice will take the pile with value = -9 and also lose.
    Remember that both play optimally so here Alice will choose the scenario that makes her win.
    Example 3:
    Input: stoneValue = [1,2,3,6]
    Output: "Tie"
    Explanation: Alice cannot win this game. She can end the game in a draw if she decided to choose all the first three piles, otherwise she will lose.
      Constraints:
    1 <= stoneValue.length <= 5 * 104
    -1000 <= stoneValue[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] stoneValue = new int[]{1, 2, 3, 7};
        String expected = "Bob";
        var result = solution.stoneGameIII(stoneValue);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] stoneValue = new int[]{1, 2, 3, -9};
        String expected = "Alice";
        var result = solution.stoneGameIII(stoneValue);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] stoneValue = new int[]{1, 2, 3, 6};
        String expected = "Tie";
        var result = solution.stoneGameIII(stoneValue);
        assertThat(result).isEqualTo(expected);
    }

}
