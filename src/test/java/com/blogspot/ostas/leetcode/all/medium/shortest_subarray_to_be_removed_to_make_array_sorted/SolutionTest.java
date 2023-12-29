package com.blogspot.ostas.leetcode.all.medium.shortest_subarray_to_be_removed_to_make_array_sorted;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,2,3,10,4,2,3,5]
    Output: 3
    Explanation: The shortest subarray we can remove is [10,4,2] of length 3. The remaining elements after that will be [1,2,3,3,5] which are sorted.
    Another correct solution is to remove the subarray [3,10,4].
    Example 2:
    Input: arr = [5,4,3,2,1]
    Output: 4
    Explanation: Since the array is strictly decreasing, we can only keep a single element. Therefore we need to remove a subarray of length 4, either [5,4,3,2] or [4,3,2,1].
    Example 3:
    Input: arr = [1,2,3]
    Output: 0
    Explanation: The array is already non-decreasing. We do not need to remove any elements.
      Constraints:
    1 <= arr.length <= 105
    0 <= arr[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 3, 10, 4, 2, 3, 5};
        int expected = 3;
        var result = solution.findLengthOfShortestSubarray(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{5, 4, 3, 2, 1};
        int expected = 4;
        var result = solution.findLengthOfShortestSubarray(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 3};
        int expected = 0;
        var result = solution.findLengthOfShortestSubarray(arr);
        assertThat(result).isEqualTo(expected);
    }

}
