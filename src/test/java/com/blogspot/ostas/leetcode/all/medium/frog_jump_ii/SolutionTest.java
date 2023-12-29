package com.blogspot.ostas.leetcode.all.medium.frog_jump_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: stones = [0,2,5,6,7]
    Output: 5
    Explanation: The above figure represents one of the optimal paths the frog can take.
    The cost of this path is 5, which is the maximum length of a jump.
    Since it is not possible to achieve a cost of less than 5, we return it.
    Example 2:
    Input: stones = [0,3,9]
    Output: 9
    Explanation:
    The frog can jump directly to the last stone and come back to the first stone.
    In this case, the length of each jump will be 9. The cost for the path will be max(9, 9) = 9.
    It can be shown that this is the minimum achievable cost.
      Constraints:
    2 <= stones.length <= 105
    0 <= stones[i] <= 109
    stones[0] == 0
    stones is sorted in a strictly increasing order.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] stones = new int[]{0, 2, 5, 6, 7};
        int expected = 5;
        var result = solution.maxJump(stones);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] stones = new int[]{0, 3, 9};
        int expected = 9;
        var result = solution.maxJump(stones);
        assertThat(result).isEqualTo(expected);
    }

}
