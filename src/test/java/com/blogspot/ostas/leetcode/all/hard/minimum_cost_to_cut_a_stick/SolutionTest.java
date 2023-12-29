package com.blogspot.ostas.leetcode.all.hard.minimum_cost_to_cut_a_stick;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 7, cuts = [1,3,4,5]
    Output: 16
    Explanation: Using cuts order = [1, 3, 4, 5] as in the input leads to the following scenario:
    The first cut is done to a rod of length 7 so the cost is 7. The second cut is done to a rod of length 6 (i.e. the second part of the first cut), the third is done to a rod of length 4 and the last cut is to a rod of length 3. The total cost is 7 + 6 + 4 + 3 = 20.
    Rearranging the cuts to be [3, 5, 1, 4] for example will lead to a scenario with total cost = 16 (as shown in the example photo 7 + 4 + 3 + 2 = 16).
    Example 2:
    Input: n = 9, cuts = [5,6,1,4,2]
    Output: 22
    Explanation: If you try the given cuts ordering the cost will be 25.
    There are much ordering with total cost <= 25, for example, the order [4, 6, 5, 2, 1] has total cost = 22 which is the minimum possible.
      Constraints:
    2 <= n <= 106
    1 <= cuts.length <= min(n - 1, 100)
    1 <= cuts[i] <= n - 1
    All the integers in cuts array are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 7;
        int[] cuts = new int[]{1, 3, 4, 5};
        int expected = 16;
        var result = solution.minCost(n, cuts);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 9;
        int[] cuts = new int[]{5, 6, 1, 4, 2};
        int expected = 22;
        var result = solution.minCost(n, cuts);
        assertThat(result).isEqualTo(expected);
    }

}
