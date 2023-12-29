package com.blogspot.ostas.leetcode.all.hard.maximum_segment_sum_after_removals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,5,6,1], removeQueries = [0,3,2,4,1]
    Output: [14,7,2,2,0]
    Explanation: Using 0 to indicate a removed element, the answer is as follows:
    Query 1: Remove the 0th element, nums becomes [0,2,5,6,1] and the maximum segment sum is 14 for segment [2,5,6,1].
    Query 2: Remove the 3rd element, nums becomes [0,2,5,0,1] and the maximum segment sum is 7 for segment [2,5].
    Query 3: Remove the 2nd element, nums becomes [0,2,0,0,1] and the maximum segment sum is 2 for segment [2].
    Query 4: Remove the 4th element, nums becomes [0,2,0,0,0] and the maximum segment sum is 2 for segment [2].
    Query 5: Remove the 1st element, nums becomes [0,0,0,0,0] and the maximum segment sum is 0, since there are no segments.
    Finally, we return [14,7,2,2,0].
    Example 2:
    Input: nums = [3,2,11,1], removeQueries = [3,2,1,0]
    Output: [16,5,3,0]
    Explanation: Using 0 to indicate a removed element, the answer is as follows:
    Query 1: Remove the 3rd element, nums becomes [3,2,11,0] and the maximum segment sum is 16 for segment [3,2,11].
    Query 2: Remove the 2nd element, nums becomes [3,2,0,0] and the maximum segment sum is 5 for segment [3,2].
    Query 3: Remove the 1st element, nums becomes [3,0,0,0] and the maximum segment sum is 3 for segment [3].
    Query 4: Remove the 0th element, nums becomes [0,0,0,0] and the maximum segment sum is 0, since there are no segments.
    Finally, we return [16,5,3,0].
      Constraints:
    n == nums.length == removeQueries.length
    1 <= n <= 105
    1 <= nums[i] <= 109
    0 <= removeQueries[i] < n
    All the values of removeQueries are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 5, 6, 1};
        int[] removeQueries = new int[]{0, 3, 2, 4, 1};
        long[] expected = new long[]{14, 7, 2, 2, 0};
        var result = solution.maximumSegmentSum(nums, removeQueries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 11, 1};
        int[] removeQueries = new int[]{3, 2, 1, 0};
        long[] expected = new long[]{16, 5, 3, 0};
        var result = solution.maximumSegmentSum(nums, removeQueries);
        assertThat(result).isEqualTo(expected);
    }

}
