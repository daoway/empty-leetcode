package com.blogspot.ostas.leetcode.all.medium.partition_array_according_to_given_pivot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [9,12,5,10,14,3,10], pivot = 10
    Output: [9,5,3,10,10,12,14]
    Explanation:
    The elements 9, 5, and 3 are less than the pivot so they are on the left side of the array.
    The elements 12 and 14 are greater than the pivot so they are on the right side of the array.
    The relative ordering of the elements less than and greater than pivot is also maintained. [9, 5, 3] and [12, 14] are the respective orderings.
    Example 2:
    Input: nums = [-3,4,3,2], pivot = 2
    Output: [-3,2,4,3]
    Explanation:
    The element -3 is less than the pivot so it is on the left side of the array.
    The elements 4 and 3 are greater than the pivot so they are on the right side of the array.
    The relative ordering of the elements less than and greater than pivot is also maintained. [-3] and [4, 3] are the respective orderings.
      Constraints:
    1 <= nums.length <= 105
    -106 <= nums[i] <= 106
    pivot equals to an element of nums.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        int[] expected = new int[]{9, 5, 3, 10, 10, 12, 14};
        var result = solution.pivotArray(nums, pivot);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-3, 4, 3, 2};
        int pivot = 2;
        int[] expected = new int[]{-3, 2, 4, 3};
        var result = solution.pivotArray(nums, pivot);
        assertThat(result).isEqualTo(expected);
    }

}
