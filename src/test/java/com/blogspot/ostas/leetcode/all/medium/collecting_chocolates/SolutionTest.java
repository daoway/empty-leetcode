package com.blogspot.ostas.leetcode.all.medium.collecting_chocolates;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [20,1,15], x = 5
    Output: 13
    Explanation: Initially, the chocolate types are [0,1,2]. We will buy the 1st type of chocolate at a cost of 1.
    Now, we will perform the operation at a cost of 5, and the types of chocolates will become [1,2,0]. We will buy the 2nd type of chocolate at a cost of 1.
    Now, we will again perform the operation at a cost of 5, and the chocolate types will become [2,0,1]. We will buy the 0th type of chocolate at a cost of 1.
    Thus, the total cost will become (1 + 5 + 1 + 5 + 1) = 13. We can prove that this is optimal.
    Example 2:
    Input: nums = [1,2,3], x = 4
    Output: 6
    Explanation: We will collect all three types of chocolates at their own price without performing any operations. Therefore, the total cost is 1 + 2 + 3 = 6.
      Constraints:
    1 <= nums.length <= 1000
    1 <= nums[i] <= 109
    1 <= x <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{20, 1, 15};
        int x = 5;
        long expected = 13;
        var result = solution.minCost(nums, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        int x = 4;
        long expected = 6;
        var result = solution.minCost(nums, x);
        assertThat(result).isEqualTo(expected);
    }

}
