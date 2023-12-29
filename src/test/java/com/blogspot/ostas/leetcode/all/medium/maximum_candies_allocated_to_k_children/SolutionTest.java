package com.blogspot.ostas.leetcode.all.medium.maximum_candies_allocated_to_k_children;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: candies = [5,8,6], k = 3
    Output: 5
    Explanation: We can divide candies[1] into 2 piles of size 5 and 3, and candies[2] into 2 piles of size 5 and 1. We now have five piles of candies of sizes 5, 5, 3, 5, and 1. We can allocate the 3 piles of size 5 to 3 children. It can be proven that each child cannot receive more than 5 candies.
    Example 2:
    Input: candies = [2,5], k = 11
    Output: 0
    Explanation: There are 11 children but only 7 candies in total, so it is impossible to ensure each child receives at least one candy. Thus, each child gets no candy and the answer is 0.
      Constraints:
    1 <= candies.length <= 105
    1 <= candies[i] <= 107
    1 <= k <= 1012
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] candies = new int[]{5, 8, 6};
        long k = 3;
        int expected = 5;
        var result = solution.maximumCandies(candies, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] candies = new int[]{2, 5};
        long k = 11;
        int expected = 0;
        var result = solution.maximumCandies(candies, k);
        assertThat(result).isEqualTo(expected);
    }

}
