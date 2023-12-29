package com.blogspot.ostas.leetcode.all.medium.maximum_element_after_decreasing_and_rearranging;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [2,2,1,2,1]
    Output: 2
    Explanation:
    We can satisfy the conditions by rearranging arr so it becomes [1,2,2,2,1].
    The largest element in arr is 2.
    Example 2:
    Input: arr = [100,1,1000]
    Output: 3
    Explanation:
    One possible way to satisfy the conditions is by doing the following:
    1. Rearrange arr so it becomes [1,100,1000].
    2. Decrease the value of the second element to 2.
    3. Decrease the value of the third element to 3.
    Now arr = [1,2,3], which satisfies the conditions.
    The largest element in arr is 3.
    Example 3:
    Input: arr = [1,2,3,4,5]
    Output: 5
    Explanation: The array already satisfies the conditions, and the largest element is 5.
      Constraints:
    1 <= arr.length <= 105
    1 <= arr[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{2, 2, 1, 2, 1};
        int expected = 2;
        var result = solution.maximumElementAfterDecrementingAndRearranging(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{100, 1, 1000};
        int expected = 3;
        var result = solution.maximumElementAfterDecrementingAndRearranging(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int expected = 5;
        var result = solution.maximumElementAfterDecrementingAndRearranging(arr);
        assertThat(result).isEqualTo(expected);
    }

}
