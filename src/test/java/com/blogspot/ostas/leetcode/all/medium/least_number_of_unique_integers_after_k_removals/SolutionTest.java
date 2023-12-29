package com.blogspot.ostas.leetcode.all.medium.least_number_of_unique_integers_after_k_removals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [5,5,4], k = 1
    Output: 1
    Explanation: Remove the single 4, only 5 is left.
    Example 2:
    Input: arr = [4,3,1,1,3,3,2], k = 3
    Output: 2
    Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.
      Constraints:
    1 <= arr.length <= 10^5
    1 <= arr[i] <= 10^9
    0 <= k <= arr.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{5, 5, 4};
        int k = 1;
        int expected = 1;
        var result = solution.findLeastNumOfUniqueInts(arr, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{4, 3, 1, 1, 3, 3, 2};
        int k = 3;
        int expected = 2;
        var result = solution.findLeastNumOfUniqueInts(arr, k);
        assertThat(result).isEqualTo(expected);
    }

}
