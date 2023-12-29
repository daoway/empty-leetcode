package com.blogspot.ostas.leetcode.all.medium.remove_stones_to_minimize_the_total;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: piles = [5,4,9], k = 2
    Output: 12
    Explanation: Steps of a possible scenario are:
    - Apply the operation on pile 2. The resulting piles are [5,4,5].
    - Apply the operation on pile 0. The resulting piles are [3,4,5].
    The total number of stones in [3,4,5] is 12.
    Example 2:
    Input: piles = [4,3,6,7], k = 3
    Output: 12
    Explanation: Steps of a possible scenario are:
    - Apply the operation on pile 2. The resulting piles are [4,3,3,7].
    - Apply the operation on pile 3. The resulting piles are [4,3,3,4].
    - Apply the operation on pile 0. The resulting piles are [2,3,3,4].
    The total number of stones in [2,3,3,4] is 12.
      Constraints:
    1 <= piles.length <= 105
    1 <= piles[i] <= 104
    1 <= k <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] piles = new int[]{5, 4, 9};
        int k = 2;
        int expected = 12;
        var result = solution.minStoneSum(piles, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] piles = new int[]{4, 3, 6, 7};
        int k = 3;
        int expected = 12;
        var result = solution.minStoneSum(piles, k);
        assertThat(result).isEqualTo(expected);
    }

}
