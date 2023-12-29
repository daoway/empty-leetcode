package com.blogspot.ostas.leetcode.all.easy.can_make_arithmetic_progression_from_sequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [3,5,1]
    Output: true
    Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
    Example 2:
    Input: arr = [1,2,4]
    Output: false
    Explanation: There is no way to reorder the elements to obtain an arithmetic progression.
      Constraints:
    2 <= arr.length <= 1000
    -106 <= arr[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{3, 5, 1};
        boolean expected = true;
        var result = solution.canMakeArithmeticProgression(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 4};
        boolean expected = false;
        var result = solution.canMakeArithmeticProgression(arr);
        assertThat(result).isEqualTo(expected);
    }

}
