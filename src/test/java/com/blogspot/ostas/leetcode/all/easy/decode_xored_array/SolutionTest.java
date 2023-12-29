package com.blogspot.ostas.leetcode.all.easy.decode_xored_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: encoded = [1,2,3], first = 1
    Output: [1,0,2,1]
    Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
    Example 2:
    Input: encoded = [6,2,7,3], first = 4
    Output: [4,2,0,7,4]
      Constraints:
    2 <= n <= 104
    encoded.length == n - 1
    0 <= encoded[i] <= 105
    0 <= first <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] encoded = new int[]{1, 2, 3};
        int first = 1;
        int[] expected = new int[]{1, 0, 2, 1};
        var result = solution.decode(encoded, first);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] encoded = new int[]{6, 2, 7, 3};
        int first = 4;
        int[] expected = new int[]{4, 2, 0, 7, 4};
        var result = solution.decode(encoded, first);
        assertThat(result).isEqualTo(expected);
    }

}
