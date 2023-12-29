package com.blogspot.ostas.leetcode.all.medium.find_score_of_an_array_after_marking_all_elements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,1,3,4,5,2]
    Output: 7
    Explanation: We mark the elements as follows:
    - 1 is the smallest unmarked element, so we mark it and its two adjacent elements: [2,1,3,4,5,2].
    - 2 is the smallest unmarked element, so we mark it and its left adjacent element: [2,1,3,4,5,2].
    - 4 is the only remaining unmarked element, so we mark it: [2,1,3,4,5,2].
    Our score is 1 + 2 + 4 = 7.
    Example 2:
    Input: nums = [2,3,5,1,3,2]
    Output: 5
    Explanation: We mark the elements as follows:
    - 1 is the smallest unmarked element, so we mark it and its two adjacent elements: [2,3,5,1,3,2].
    - 2 is the smallest unmarked element, since there are two of them, we choose the left-most one, so we mark the one at index 0 and its right adjacent element: [2,3,5,1,3,2].
    - 2 is the only remaining unmarked element, so we mark it: [2,3,5,1,3,2].
    Our score is 1 + 2 + 2 = 5.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, 3, 4, 5, 2};
        long expected = 7;
        var result = solution.findScore(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 5, 1, 3, 2};
        long expected = 5;
        var result = solution.findScore(nums);
        assertThat(result).isEqualTo(expected);
    }

}
