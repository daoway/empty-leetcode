package com.blogspot.ostas.leetcode.all.medium.h_index_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: citations = [0,1,3,5,6]
    Output: 3
    Explanation: [0,1,3,5,6] means the researcher has 5 papers in total and each of them had received 0, 1, 3, 5, 6 citations respectively.
    Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
    Example 2:
    Input: citations = [1,2,100]
    Output: 2
      Constraints:
    n == citations.length
    1 <= n <= 105
    0 <= citations[i] <= 1000
    citations is sorted in ascending order.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] citations = new int[]{0, 1, 3, 5, 6};
        int expected = 3;
        var result = solution.hIndex(citations);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] citations = new int[]{1, 2, 100};
        int expected = 2;
        var result = solution.hIndex(citations);
        assertThat(result).isEqualTo(expected);
    }

}
