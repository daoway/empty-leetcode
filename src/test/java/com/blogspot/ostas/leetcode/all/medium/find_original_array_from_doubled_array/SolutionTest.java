package com.blogspot.ostas.leetcode.all.medium.find_original_array_from_doubled_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: changed = [1,3,4,2,6,8]
    Output: [1,3,4]
    Explanation: One possible original array could be [1,3,4]:
    - Twice the value of 1 is 1 * 2 = 2.
    - Twice the value of 3 is 3 * 2 = 6.
    - Twice the value of 4 is 4 * 2 = 8.
    Other original arrays could be [4,3,1] or [3,1,4].
    Example 2:
    Input: changed = [6,3,0,1]
    Output: []
    Explanation: changed is not a doubled array.
    Example 3:
    Input: changed = [1]
    Output: []
    Explanation: changed is not a doubled array.
      Constraints:
    1 <= changed.length <= 105
    0 <= changed[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] changed = new int[]{1, 3, 4, 2, 6, 8};
        int[] expected = new int[]{1, 3, 4};
        var result = solution.findOriginalArray(changed);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] changed = new int[]{6, 3, 0, 1};
        int[] expected = new int[]{};
        var result = solution.findOriginalArray(changed);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] changed = new int[]{1};
        int[] expected = new int[]{};
        var result = solution.findOriginalArray(changed);
        assertThat(result).isEqualTo(expected);
    }

}
