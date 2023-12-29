package com.blogspot.ostas.leetcode.all.hard.next_greater_element_iv;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,4,0,9,6]
    Output: [9,6,6,-1,-1]
    Explanation:
    0th index: 4 is the first integer greater than 2, and 9 is the second integer greater than 2, to the right of 2.
    1st index: 9 is the first, and 6 is the second integer greater than 4, to the right of 4.
    2nd index: 9 is the first, and 6 is the second integer greater than 0, to the right of 0.
    3rd index: There is no integer greater than 9 to its right, so the second greater integer is considered to be -1.
    4th index: There is no integer greater than 6 to its right, so the second greater integer is considered to be -1.
    Thus, we return [9,6,6,-1,-1].
    Example 2:
    Input: nums = [3,3]
    Output: [-1,-1]
    Explanation:
    We return [-1,-1] since neither integer has any integer greater than it.
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 4, 0, 9, 6};
        int[] expected = new int[]{9, 6, 6, -1, -1};
        var result = solution.secondGreaterElement(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 3};
        int[] expected = new int[]{-1, -1};
        var result = solution.secondGreaterElement(nums);
        assertThat(result).isEqualTo(expected);
    }

}
