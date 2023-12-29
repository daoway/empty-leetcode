package com.blogspot.ostas.leetcode.all.easy.add_to_array_form_of_integer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = [1,2,0,0], k = 34
    Output: [1,2,3,4]
    Explanation: 1200 + 34 = 1234
    Example 2:
    Input: num = [2,7,4], k = 181
    Output: [4,5,5]
    Explanation: 274 + 181 = 455
    Example 3:
    Input: num = [2,1,5], k = 806
    Output: [1,0,2,1]
    Explanation: 215 + 806 = 1021
      Constraints:
    1 <= num.length <= 104
    0 <= num[i] <= 9
    num does not contain any leading zeros except for the zero itself.
    1 <= k <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] num = new int[]{1, 2, 0, 0};
        int k = 34;
        List<Integer> expected = List.of(1, 2, 3, 4);
        var result = solution.addToArrayForm(num, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] num = new int[]{2, 7, 4};
        int k = 181;
        List<Integer> expected = List.of(4, 5, 5);
        var result = solution.addToArrayForm(num, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] num = new int[]{2, 1, 5};
        int k = 806;
        List<Integer> expected = List.of(1, 0, 2, 1);
        var result = solution.addToArrayForm(num, k);
        assertThat(result).isEqualTo(expected);
    }

}
