package com.blogspot.ostas.leetcode.all.hard.minimum_cost_to_make_array_equal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,5,2], cost = [2,3,1,14]
    Output: 8
    Explanation: We can make all the elements equal to 2 in the following way:
    - Increase the 0th element one time. The cost is 2.
    - Decrease the 1st element one time. The cost is 3.
    - Decrease the 2nd element three times. The cost is 1 + 1 + 1 = 3.
    The total cost is 2 + 3 + 3 = 8.
    It can be shown that we cannot make the array equal with a smaller cost.
    Example 2:
    Input: nums = [2,2,2,2,2], cost = [4,2,8,1,3]
    Output: 0
    Explanation: All the elements are already equal, so no operations are needed.
      Constraints:
    n == nums.length == cost.length
    1 <= n <= 105
    1 <= nums[i], cost[i] <= 106
    Test cases are generated in a way that the output doesn't exceed 253-1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 5, 2};
        int[] cost = new int[]{2, 3, 1, 14};
        long expected = 8;
        var result = solution.minCost(nums, cost);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 2, 2, 2, 2};
        int[] cost = new int[]{4, 2, 8, 1, 3};
        long expected = 0;
        var result = solution.minCost(nums, cost);
        assertThat(result).isEqualTo(expected);
    }

}
