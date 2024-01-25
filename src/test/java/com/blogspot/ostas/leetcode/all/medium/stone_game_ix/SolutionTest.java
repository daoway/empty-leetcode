package com.blogspot.ostas.leetcode.all.medium.stone_game_ix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: stones = [2,1]
    Output: true
    Explanation: The game will be played as follows:
    - Turn 1: Alice can remove either stone.
    - Turn 2: Bob removes the remaining stone.
    The sum of the removed stones is 1 + 2 = 3 and is divisible by 3. Therefore, Bob loses and Alice wins the game.
    Example 2:
    Input: stones = [2]
    Output: false
    Explanation: Alice will remove the only stone, and the sum of the values on the removed stones is 2.
    Since all the stones are removed and the sum of values is not divisible by 3, Bob wins the game.
    Example 3:
    Input: stones = [5,1,2,4,3]
    Output: false
    Explanation: Bob will always win. One possible way for Bob to win is shown below:
    - Turn 1: Alice can remove the second stone with value 1. Sum of removed stones = 1.
    - Turn 2: Bob removes the fifth stone with value 3. Sum of removed stones = 1 + 3 = 4.
    - Turn 3: Alices removes the fourth stone with value 4. Sum of removed stones = 1 + 3 + 4 = 8.
    - Turn 4: Bob removes the third stone with value 2. Sum of removed stones = 1 + 3 + 4 + 2 = 10.
    - Turn 5: Alice removes the first stone with value 5. Sum of removed stones = 1 + 3 + 4 + 2 + 5 = 15.
    Alice loses the game because the sum of the removed stones (15) is divisible by 3. Bob wins the game.
      Constraints:
    1 <= stones.length <= 105
    1 <= stones[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] stones = new int[]{2, 1};
        boolean expected = true;
        var result = solution.stoneGameIX(stones);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] stones = new int[]{2};
        boolean expected = false;
        var result = solution.stoneGameIX(stones);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] stones = new int[]{5, 1, 2, 4, 3};
        boolean expected = false;
        var result = solution.stoneGameIX(stones);
        assertThat(result).isEqualTo(expected);
    }

}
