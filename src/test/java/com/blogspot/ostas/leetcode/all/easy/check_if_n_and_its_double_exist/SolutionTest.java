package com.blogspot.ostas.leetcode.all.easy.check_if_n_and_its_double_exist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [10,2,5,3]
    Output: true
    Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
    Example 2:
    Input: arr = [3,1,7,11]
    Output: false
    Explanation: There is no i and j that satisfy the conditions.
      Constraints:
    2 <= arr.length <= 500
    -103 <= arr[i] <= 103
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{10, 2, 5, 3};
        boolean expected = true;
        var result = solution.checkIfExist(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{3, 1, 7, 11};
        boolean expected = false;
        var result = solution.checkIfExist(arr);
        assertThat(result).isEqualTo(expected);
    }

}
