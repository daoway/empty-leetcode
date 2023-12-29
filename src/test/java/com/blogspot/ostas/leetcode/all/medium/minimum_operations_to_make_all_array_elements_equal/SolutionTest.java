package com.blogspot.ostas.leetcode.all.medium.minimum_operations_to_make_all_array_elements_equal;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,1,6,8], queries = [1,5]
    Output: [14,10]
    Explanation: For the first query we can do the following operations:
    - Decrease nums[0] 2 times, so that nums = [1,1,6,8].
    - Decrease nums[2] 5 times, so that nums = [1,1,1,8].
    - Decrease nums[3] 7 times, so that nums = [1,1,1,1].
    So the total number of operations for the first query is 2 + 5 + 7 = 14.
    For the second query we can do the following operations:
    - Increase nums[0] 2 times, so that nums = [5,1,6,8].
    - Increase nums[1] 4 times, so that nums = [5,5,6,8].
    - Decrease nums[2] 1 time, so that nums = [5,5,5,8].
    - Decrease nums[3] 3 times, so that nums = [5,5,5,5].
    So the total number of operations for the second query is 2 + 4 + 1 + 3 = 10.
    Example 2:
    Input: nums = [2,9,6,3], queries = [10]
    Output: [20]
    Explanation: We can increase each value in the array to 10. The total number of operations will be 8 + 1 + 4 + 7 = 20.
      Constraints:
    n == nums.length
    m == queries.length
    1 <= n, m <= 105
    1 <= nums[i], queries[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 1, 6, 8};
        int[] queries = new int[]{1, 5};
        List<Long> expected = List.of(14L, 10L);
        var result = solution.minOperations(nums, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 9, 6, 3};
        int[] queries = new int[]{10};
        List<Long> expected = List.of(20L);
        var result = solution.minOperations(nums, queries);
        assertThat(result).isEqualTo(expected);
    }

}
