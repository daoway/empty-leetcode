package com.blogspot.ostas.leetcode.all.easy.k_items_with_the_maximum_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: numOnes = 3, numZeros = 2, numNegOnes = 0, k = 2
    Output: 2
    Explanation: We have a bag of items with numbers written on them {1, 1, 1, 0, 0}. We take 2 items with 1 written on them and get a sum in a total of 2.
    It can be proven that 2 is the maximum possible sum.
    Example 2:
    Input: numOnes = 3, numZeros = 2, numNegOnes = 0, k = 4
    Output: 3
    Explanation: We have a bag of items with numbers written on them {1, 1, 1, 0, 0}. We take 3 items with 1 written on them, and 1 item with 0 written on it, and get a sum in a total of 3.
    It can be proven that 3 is the maximum possible sum.
      Constraints:
    0 <= numOnes, numZeros, numNegOnes <= 50
    0 <= k <= numOnes + numZeros + numNegOnes
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int numOnes = 3;
        int numZeros = 2;
        int numNegOnes = 0;
        int k = 2;
        int expected = 2;
        var result = solution.kItemsWithMaximumSum(numOnes, numZeros, numNegOnes, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int numOnes = 3;
        int numZeros = 2;
        int numNegOnes = 0;
        int k = 4;
        int expected = 3;
        var result = solution.kItemsWithMaximumSum(numOnes, numZeros, numNegOnes, k);
        assertThat(result).isEqualTo(expected);
    }

}
