package com.blogspot.ostas.leetcode.all.medium.maximize_the_topmost_element_after_k_moves;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [5,2,2,4,0,6], k = 4
    Output: 5
    Explanation:
    One of the ways we can end with 5 at the top of the pile after 4 moves is as follows:
    - Step 1: Remove the topmost element = 5. The pile becomes [2,2,4,0,6].
    - Step 2: Remove the topmost element = 2. The pile becomes [2,4,0,6].
    - Step 3: Remove the topmost element = 2. The pile becomes [4,0,6].
    - Step 4: Add 5 back onto the pile. The pile becomes [5,4,0,6].
    Note that this is not the only way to end with 5 at the top of the pile. It can be shown that 5 is the largest answer possible after 4 moves.
    Example 2:
    Input: nums = [2], k = 1
    Output: -1
    Explanation:
    In the first move, our only option is to pop the topmost element of the pile.
    Since it is not possible to obtain a non-empty pile after one move, we return -1.
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i], k <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{5, 2, 2, 4, 0, 6};
        int k = 4;
        int expected = 5;
        var result = solution.maximumTop(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2};
        int k = 1;
        int expected = -1;
        var result = solution.maximumTop(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
