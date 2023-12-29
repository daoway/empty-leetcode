package com.blogspot.ostas.leetcode.all.medium.maximum_length_of_pair_chain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: pairs = [[1,2],[2,3],[3,4]]
    Output: 2
    Explanation: The longest chain is [1,2] -> [3,4].
    Example 2:
    Input: pairs = [[1,2],[7,8],[4,5]]
    Output: 3
    Explanation: The longest chain is [1,2] -> [4,5] -> [7,8].
      Constraints:
    n == pairs.length
    1 <= n <= 1000
    -1000 <= lefti < righti <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] pairs = new int[][]{{1, 2}, {2, 3}, {3, 4}};
        int expected = 2;
        var result = solution.findLongestChain(pairs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] pairs = new int[][]{{1, 2}, {7, 8}, {4, 5}};
        int expected = 3;
        var result = solution.findLongestChain(pairs);
        assertThat(result).isEqualTo(expected);
    }

}
