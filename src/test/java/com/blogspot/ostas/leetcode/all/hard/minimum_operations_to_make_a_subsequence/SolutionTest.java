package com.blogspot.ostas.leetcode.all.hard.minimum_operations_to_make_a_subsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: target = [5,1,3], arr = [9,4,2,3,4]
    Output: 2
    Explanation: You can add 5 and 1 in such a way that makes arr = [5,9,4,1,2,3,4], then target will be a subsequence of arr.
    Example 2:
    Input: target = [6,4,8,1,3,2], arr = [4,7,6,2,3,8,6,1]
    Output: 3
      Constraints:
    1 <= target.length, arr.length <= 105
    1 <= target[i], arr[i] <= 109
    target contains no duplicates.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] target = new int[]{5, 1, 3};
        int[] arr = new int[]{9, 4, 2, 3, 4};
        int expected = 2;
        var result = solution.minOperations(target, arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] target = new int[]{6, 4, 8, 1, 3, 2};
        int[] arr = new int[]{4, 7, 6, 2, 3, 8, 6, 1};
        int expected = 3;
        var result = solution.minOperations(target, arr);
        assertThat(result).isEqualTo(expected);
    }

}
