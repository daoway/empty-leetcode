package com.blogspot.ostas.leetcode.all.medium.find_the_prefix_common_array_of_two_arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: A = [1,3,2,4], B = [3,1,2,4]
    Output: [0,2,3,4]
    Explanation: At i = 0: no number is common, so C[0] = 0.
    At i = 1: 1 and 3 are common in A and B, so C[1] = 2.
    At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3.
    At i = 3: 1, 2, 3, and 4 are common in A and B, so C[3] = 4.
    Example 2:
    Input: A = [2,3,1], B = [3,1,2]
    Output: [0,1,3]
    Explanation: At i = 0: no number is common, so C[0] = 0.
    At i = 1: only 3 is common in A and B, so C[1] = 1.
    At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3.
      Constraints:
    1 <= A.length == B.length == n <= 50
    1 <= A[i], B[i] <= n
    It is guaranteed that A and B are both a permutation of n integers.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] A = new int[]{1, 3, 2, 4};
        int[] B = new int[]{3, 1, 2, 4};
        int[] expected = new int[]{0, 2, 3, 4};
        var result = solution.findThePrefixCommonArray(A, B);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] A = new int[]{2, 3, 1};
        int[] B = new int[]{3, 1, 2};
        int[] expected = new int[]{0, 1, 3};
        var result = solution.findThePrefixCommonArray(A, B);
        assertThat(result).isEqualTo(expected);
    }

}
