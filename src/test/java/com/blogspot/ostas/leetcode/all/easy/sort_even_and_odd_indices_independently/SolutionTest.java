package com.blogspot.ostas.leetcode.all.easy.sort_even_and_odd_indices_independently;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,1,2,3]
    Output: [2,3,4,1]
    Explanation:
    First, we sort the values present at odd indices (1 and 3) in non-increasing order.
    So, nums changes from [4,1,2,3] to [4,3,2,1].
    Next, we sort the values present at even indices (0 and 2) in non-decreasing order.
    So, nums changes from [4,1,2,3] to [2,3,4,1].
    Thus, the array formed after rearranging the values is [2,3,4,1].
    Example 2:
    Input: nums = [2,1]
    Output: [2,1]
    Explanation:
    Since there is exactly one odd index and one even index, no rearrangement of values takes place.
    The resultant array formed is [2,1], which is the same as the initial array.
      Constraints:
    1 <= nums.length <= 100
    1 <= nums[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 1, 2, 3};
        int[] expected = new int[]{2, 3, 4, 1};
        var result = solution.sortEvenOdd(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1};
        int[] expected = new int[]{2, 1};
        var result = solution.sortEvenOdd(nums);
        assertThat(result).isEqualTo(expected);
    }

}
