package com.blogspot.ostas.leetcode.all.easy.find_the_array_concatenation_value;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [7,52,2,4]
    Output: 596
    Explanation: Before performing any operation, nums is [7,52,2,4] and concatenation value is 0.
     - In the first operation:
    We pick the first element, 7, and the last element, 4.
    Their concatenation is 74, and we add it to the concatenation value, so it becomes equal to 74.
    Then we delete them from nums, so nums becomes equal to [52,2].
     - In the second operation:
    We pick the first element, 52, and the last element, 2.
    Their concatenation is 522, and we add it to the concatenation value, so it becomes equal to 596.
    Then we delete them from the nums, so nums becomes empty.
    Since the concatenation value is 596 so the answer is 596.
    Example 2:
    Input: nums = [5,14,13,8,12]
    Output: 673
    Explanation: Before performing any operation, nums is [5,14,13,8,12] and concatenation value is 0.
     - In the first operation:
    We pick the first element, 5, and the last element, 12.
    Their concatenation is 512, and we add it to the concatenation value, so it becomes equal to 512.
    Then we delete them from the nums, so nums becomes equal to [14,13,8].
     - In the second operation:
    We pick the first element, 14, and the last element, 8.
    Their concatenation is 148, and we add it to the concatenation value, so it becomes equal to 660.
    Then we delete them from the nums, so nums becomes equal to [13].
     - In the third operation:
    nums has only one element, so we pick 13 and add it to the concatenation value, so it becomes equal to 673.
    Then we delete it from nums, so nums become empty.
    Since the concatenation value is 673 so the answer is 673.
      Constraints:
    1 <= nums.length <= 1000
    1 <= nums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{7, 52, 2, 4};
        long expected = 596;
        var result = solution.findTheArrayConcVal(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 14, 13, 8, 12};
        long expected = 673;
        var result = solution.findTheArrayConcVal(nums);
        assertThat(result).isEqualTo(expected);
    }

}
