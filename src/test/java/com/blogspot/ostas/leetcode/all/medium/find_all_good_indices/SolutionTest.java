package com.blogspot.ostas.leetcode.all.medium.find_all_good_indices;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,1,1,1,3,4,1], k = 2
    Output: [2,3]
    Explanation: There are two good indices in the array:
    - Index 2. The subarray [2,1] is in non-increasing order, and the subarray [1,3] is in non-decreasing order.
    - Index 3. The subarray [1,1] is in non-increasing order, and the subarray [3,4] is in non-decreasing order.
    Note that the index 4 is not good because [4,1] is not non-decreasing.
    Example 2:
    Input: nums = [2,1,1,2], k = 2
    Output: []
    Explanation: There are no good indices in this array.
      Constraints:
    n == nums.length
    3 <= n <= 105
    1 <= nums[i] <= 106
    1 <= k <= n / 2
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, 1, 1, 3, 4, 1};
        int k = 2;
        List<Integer> expected = List.of(2, 3);
        var result = solution.goodIndices(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, 1, 2};
        int k = 2;
        List<Integer> expected = List.of();
        var result = solution.goodIndices(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
