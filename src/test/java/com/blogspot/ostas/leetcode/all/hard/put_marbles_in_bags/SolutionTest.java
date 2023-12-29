package com.blogspot.ostas.leetcode.all.hard.put_marbles_in_bags;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: weights = [1,3,5,1], k = 2
    Output: 4
    Explanation:
    The distribution [1],[3,5,1] results in the minimal score of (1+1) + (3+1) = 6.
    The distribution [1,3],[5,1], results in the maximal score of (1+3) + (5+1) = 10.
    Thus, we return their difference 10 - 6 = 4.
    Example 2:
    Input: weights = [1, 3], k = 2
    Output: 0
    Explanation: The only distribution possible is [1],[3].
    Since both the maximal and minimal score are the same, we return 0.
      Constraints:
    1 <= k <= weights.length <= 105
    1 <= weights[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] weights = new int[]{1, 3, 5, 1};
        int k = 2;
        long expected = 4;
        var result = solution.putMarbles(weights, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] weights = new int[]{1, 3};
        int k = 2;
        long expected = 0;
        var result = solution.putMarbles(weights, k);
        assertThat(result).isEqualTo(expected);
    }


}
