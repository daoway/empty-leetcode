package com.blogspot.ostas.leetcode.all.medium.array_of_doubled_pairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [3,1,3,6]
    Output: false
    Example 2:
    Input: arr = [2,1,2,6]
    Output: false
    Example 3:
    Input: arr = [4,-2,2,-4]
    Output: true
    Explanation: We can take two groups, [-2,-4] and [2,4] to form [-2,-4,2,4] or [2,4,-2,-4].
      Constraints:
    2 <= arr.length <= 3 * 104
    arr.length is even.
    -105 <= arr[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{3, 1, 3, 6};
        boolean expected = false;
        var result = solution.canReorderDoubled(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{2, 1, 2, 6};
        boolean expected = false;
        var result = solution.canReorderDoubled(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{4, -2, 2, -4};
        boolean expected = true;
        var result = solution.canReorderDoubled(arr);
        assertThat(result).isEqualTo(expected);
    }

}
