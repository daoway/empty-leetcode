package com.blogspot.ostas.leetcode.all.medium.maximum_sum_obtained_of_any_permutation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4,5], requests = [[1,3],[0,1]]
    Output: 19
    Explanation: One permutation of nums is [2,1,3,4,5] with the following result:
    requests[0] -> nums[1] + nums[2] + nums[3] = 1 + 3 + 4 = 8
    requests[1] -> nums[0] + nums[1] = 2 + 1 = 3
    Total sum: 8 + 3 = 11.
    A permutation with a higher total sum is [3,5,4,2,1] with the following result:
    requests[0] -> nums[1] + nums[2] + nums[3] = 5 + 4 + 2 = 11
    requests[1] -> nums[0] + nums[1] = 3 + 5  = 8
    Total sum: 11 + 8 = 19, which is the best that you can do.
    Example 2:
    Input: nums = [1,2,3,4,5,6], requests = [[0,1]]
    Output: 11
    Explanation: A permutation with the max total sum is [6,5,4,3,2,1] with request sums [11].
    Example 3:
    Input: nums = [1,2,3,4,5,10], requests = [[0,2],[1,3],[1,1]]
    Output: 47
    Explanation: A permutation with the max total sum is [4,10,5,3,2,1] with request sums [19,18,10].
      Constraints:
    n == nums.length
    1 <= n <= 105
    0 <= nums[i] <= 105
    1 <= requests.length <= 105
    requests[i].length == 2
    0 <= starti <= endi < n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int[][] requests = new int[][]{{1, 3}, {0, 1}};
        int expected = 19;
        var result = solution.maxSumRangeQuery(nums, requests);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[][] requests = new int[][]{{0, 1}};
        int expected = 11;
        var result = solution.maxSumRangeQuery(nums, requests);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5, 10};
        int[][] requests = new int[][]{{0, 2}, {1, 3}, {1, 1}};
        int expected = 47;
        var result = solution.maxSumRangeQuery(nums, requests);
        assertThat(result).isEqualTo(expected);
    }

}
