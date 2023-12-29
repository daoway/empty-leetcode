package com.blogspot.ostas.leetcode.all.medium.make_k_subarray_sums_equal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,4,1,3], k = 2
    Output: 1
    Explanation: we can do one operation on index 1 to make its value equal to 3.
    The array after the operation is [1,3,1,3]
    - Subarray starts at index 0 is [1, 3], and its sum is 4
    - Subarray starts at index 1 is [3, 1], and its sum is 4
    - Subarray starts at index 2 is [1, 3], and its sum is 4
    - Subarray starts at index 3 is [3, 1], and its sum is 4
    Example 2:
    Input: arr = [2,5,5,7], k = 3
    Output: 5
    Explanation: we can do three operations on index 0 to make its value equal to 5 and two operations on index 3 to make its value equal to 5.
    The array after the operations is [5,5,5,5]
    - Subarray starts at index 0 is [5, 5, 5], and its sum is 15
    - Subarray starts at index 1 is [5, 5, 5], and its sum is 15
    - Subarray starts at index 2 is [5, 5, 5], and its sum is 15
    - Subarray starts at index 3 is [5, 5, 5], and its sum is 15
      Constraints:
    1 <= k <= arr.length <= 105
    1 <= arr[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 4, 1, 3};
        int k = 2;
        long expected = 1;
        var result = solution.makeSubKSumEqual(arr, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{2, 5, 5, 7};
        int k = 3;
        long expected = 5;
        var result = solution.makeSubKSumEqual(arr, k);
        assertThat(result).isEqualTo(expected);
    }

}
