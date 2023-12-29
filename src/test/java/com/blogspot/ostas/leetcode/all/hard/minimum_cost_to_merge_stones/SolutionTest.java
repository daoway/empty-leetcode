package com.blogspot.ostas.leetcode.all.hard.minimum_cost_to_merge_stones;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: stones = [3,2,4,1], k = 2
    Output: 20
    Explanation: We start with [3, 2, 4, 1].
    We merge [3, 2] for a cost of 5, and we are left with [5, 4, 1].
    We merge [4, 1] for a cost of 5, and we are left with [5, 5].
    We merge [5, 5] for a cost of 10, and we are left with [10].
    The total cost was 20, and this is the minimum possible.
    Example 2:
    Input: stones = [3,2,4,1], k = 3
    Output: -1
    Explanation: After any merge operation, there are 2 piles left, and we can't merge anymore.  So the task is impossible.
    Example 3:
    Input: stones = [3,5,1,2,6], k = 3
    Output: 25
    Explanation: We start with [3, 5, 1, 2, 6].
    We merge [5, 1, 2] for a cost of 8, and we are left with [3, 8, 6].
    We merge [3, 8, 6] for a cost of 17, and we are left with [17].
    The total cost was 25, and this is the minimum possible.
      Constraints:
    n == stones.length
    1 <= n <= 30
    1 <= stones[i] <= 100
    2 <= k <= 30
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] stones = new int[]{3, 2, 4, 1};
        int k = 2;
        int expected = 20;
        var result = solution.mergeStones(stones, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] stones = new int[]{3, 2, 4, 1};
        int k = 3;
        int expected = -1;
        var result = solution.mergeStones(stones, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] stones = new int[]{3, 5, 1, 2, 6};
        int k = 3;
        int expected = 25;
        var result = solution.mergeStones(stones, k);
        assertThat(result).isEqualTo(expected);
    }

}
