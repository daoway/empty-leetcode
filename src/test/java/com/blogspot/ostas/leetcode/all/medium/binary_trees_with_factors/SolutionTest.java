package com.blogspot.ostas.leetcode.all.medium.binary_trees_with_factors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [2,4]
    Output: 3
    Explanation: We can make these trees: [2], [4], [4, 2, 2]
    Example 2:
    Input: arr = [2,4,5,10]
    Output: 7
    Explanation: We can make these trees: [2], [4], [5], [10], [4, 2, 2], [10, 2, 5], [10, 5, 2].
      Constraints:
    1 <= arr.length <= 1000
    2 <= arr[i] <= 109
    All the values of arr are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{2, 4};
        int expected = 3;
        var result = solution.numFactoredBinaryTrees(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{2, 4, 5, 10};
        int expected = 7;
        var result = solution.numFactoredBinaryTrees(arr);
        assertThat(result).isEqualTo(expected);
    }

}
