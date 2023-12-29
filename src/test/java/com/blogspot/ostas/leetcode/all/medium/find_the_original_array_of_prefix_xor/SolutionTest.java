package com.blogspot.ostas.leetcode.all.medium.find_the_original_array_of_prefix_xor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: pref = [5,2,0,3,1]
    Output: [5,7,2,3,2]
    Explanation: From the array [5,7,2,3,2] we have the following:
    - pref[0] = 5.
    - pref[1] = 5 ^ 7 = 2.
    - pref[2] = 5 ^ 7 ^ 2 = 0.
    - pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3.
    - pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1.
    Example 2:
    Input: pref = [13]
    Output: [13]
    Explanation: We have pref[0] = arr[0] = 13.
      Constraints:
    1 <= pref.length <= 105
    0 <= pref[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] pref = new int[]{5, 2, 0, 3, 1};
        int[] expected = new int[]{5, 7, 2, 3, 2};
        var result = solution.findArray(pref);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] pref = new int[]{13};
        int[] expected = new int[]{13};
        var result = solution.findArray(pref);
        assertThat(result).isEqualTo(expected);
    }

}
