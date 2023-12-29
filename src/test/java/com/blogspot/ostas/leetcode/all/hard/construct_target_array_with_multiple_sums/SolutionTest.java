package com.blogspot.ostas.leetcode.all.hard.construct_target_array_with_multiple_sums;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: target = [9,3,5]
    Output: true
    Explanation: Start with arr = [1, 1, 1]
    [1, 1, 1], sum = 3 choose index 1
    [1, 3, 1], sum = 5 choose index 2
    [1, 3, 5], sum = 9 choose index 0
    [9, 3, 5] Done
    Example 2:
    Input: target = [1,1,1,2]
    Output: false
    Explanation: Impossible to create target array from [1,1,1,1].
    Example 3:
    Input: target = [8,5]
    Output: true
      Constraints:
    n == target.length
    1 <= n <= 5 * 104
    1 <= target[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] target = new int[]{9, 3, 5};
        boolean expected = true;
        var result = solution.isPossible(target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] target = new int[]{1, 1, 1, 2};
        boolean expected = false;
        var result = solution.isPossible(target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] target = new int[]{8, 5};
        boolean expected = true;
        var result = solution.isPossible(target);
        assertThat(result).isEqualTo(expected);
    }

}
