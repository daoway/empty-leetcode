package com.blogspot.ostas.leetcode.all.medium.decode_xored_permutation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: encoded = [3,1]
    Output: [1,2,3]
    Explanation: If perm = [1,2,3], then encoded = [1 XOR 2,2 XOR 3] = [3,1]
    Example 2:
    Input: encoded = [6,5,4,6]
    Output: [2,4,1,5,3]
      Constraints:
    3 <= n < 105
    n is odd.
    encoded.length == n - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] encoded = new int[]{3, 1};
        int[] expected = new int[]{1, 2, 3};
        var result = solution.decode(encoded);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] encoded = new int[]{6, 5, 4, 6};
        int[] expected = new int[]{2, 4, 1, 5, 3};
        var result = solution.decode(encoded);
        assertThat(result).isEqualTo(expected);
    }

}
