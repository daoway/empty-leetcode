package com.blogspot.ostas.leetcode.all.hard.minimum_reverse_operations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, p = 0, banned = [1,2], k = 4
    Output: [0,-1,-1,1]
    Explanation: In this case k = 4 so there is only one possible reverse operation we can perform, which is reversing the whole array. Initially, 1 is placed at position 0 so the amount of operations we need for position 0 is 0. We can never place a 1 on the banned positions, so the answer for positions 1 and 2 is -1. Finally, with one reverse operation we can bring the 1 to index 3, so the answer for position 3 is 1.
    Example 2:
    Input: n = 5, p = 0, banned = [2,4], k = 3
    Output: [0,-1,-1,-1,-1]
    Explanation: In this case the 1 is initially at position 0, so the answer for that position is 0. We can perform reverse operations of size 3. The 1 is currently located at position 0, so we need to reverse the subarray [0, 2] for it to leave that position, but reversing that subarray makes position 2 have a 1, which shouldn't happen. So, we can't move the 1 from position 0, making the result for all the other positions -1.
    Example 3:
    Input: n = 4, p = 2, banned = [0,1,3], k = 1
    Output: [-1,-1,0,-1]
    Explanation: In this case we can only perform reverse operations of size 1. So the 1 never changes its position.
      Constraints:
    1 <= n <= 105
    0 <= p <= n - 1
    0 <= banned.length <= n - 1
    0 <= banned[i] <= n - 1
    1 <= k <= n
    banned[i] != p
    all values in banned are unique
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int p = 0;
        int[] banned = new int[]{1, 2};
        int k = 4;
        int[] expected = new int[]{0, -1, -1, 1};
        var result = solution.minReverseOperations(n, p, banned, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int p = 0;
        int[] banned = new int[]{2, 4};
        int k = 3;
        int[] expected = new int[]{0, -1, -1, -1, -1};
        var result = solution.minReverseOperations(n, p, banned, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 4;
        int p = 2;
        int[] banned = new int[]{0, 1, 3};
        int k = 1;
        int[] expected = new int[]{-1, -1, 0, -1};
        var result = solution.minReverseOperations(n, p, banned, k);
        assertThat(result).isEqualTo(expected);
    }

}
