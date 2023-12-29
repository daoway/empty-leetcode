package com.blogspot.ostas.leetcode.all.medium.circular_array_loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,-1,1,2,2]
    Output: true
    Explanation: The graph shows how the indices are connected. White nodes are jumping forward, while red is jumping backward.
    We can see the cycle 0 --> 2 --> 3 --> 0 --> ..., and all of its nodes are white (jumping in the same direction).
    Example 2:
    Input: nums = [-1,-2,-3,-4,-5,6]
    Output: false
    Explanation: The graph shows how the indices are connected. White nodes are jumping forward, while red is jumping backward.
    The only cycle is of size 1, so we return false.
    Example 3:
    Input: nums = [1,-1,5,1,4]
    Output: true
    Explanation: The graph shows how the indices are connected. White nodes are jumping forward, while red is jumping backward.
    We can see the cycle 0 --> 1 --> 0 --> ..., and while it is of size > 1, it has a node jumping forward and a node jumping backward, so it is not a cycle.
    We can see the cycle 3 --> 4 --> 3 --> ..., and all of its nodes are white (jumping in the same direction).
      Constraints:
    1 <= nums.length <= 5000
    -1000 <= nums[i] <= 1000
    nums[i] != 0
      Follow up: Could you solve it in O(n) time complexity and O(1) extra space complexity?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, -1, 1, 2, 2};
        boolean expected = true;
        var result = solution.circularArrayLoop(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-1, -2, -3, -4, -5, 6};
        boolean expected = false;
        var result = solution.circularArrayLoop(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, -1, 5, 1, 4};
        boolean expected = true;
        var result = solution.circularArrayLoop(nums);
        assertThat(result).isEqualTo(expected);
    }

}
