package com.blogspot.ostas.leetcode.all.medium.sort_the_jumbled_numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: mapping = [8,9,4,0,2,1,3,5,7,6], nums = [991,338,38]
    Output: [338,38,991]
    Explanation:
    Map the number 991 as follows:
    1. mapping[9] = 6, so all occurrences of the digit 9 will become 6.
    2. mapping[1] = 9, so all occurrences of the digit 1 will become 9.
    Therefore, the mapped value of 991 is 669.
    338 maps to 007, or 7 after removing the leading zeros.
    38 maps to 07, which is also 7 after removing leading zeros.
    Since 338 and 38 share the same mapped value, they should remain in the same relative order, so 338 comes before 38.
    Thus, the sorted array is [338,38,991].
    Example 2:
    Input: mapping = [0,1,2,3,4,5,6,7,8,9], nums = [789,456,123]
    Output: [123,456,789]
    Explanation: 789 maps to 789, 456 maps to 456, and 123 maps to 123. Thus, the sorted array is [123,456,789].
      Constraints:
    mapping.length == 10
    0 <= mapping[i] <= 9
    All the values of mapping[i] are unique.
    1 <= nums.length <= 3 * 104
    0 <= nums[i] < 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] mapping = new int[]{8, 9, 4, 0, 2, 1, 3, 5, 7, 6};
        int[] nums = new int[]{991, 338, 38};
        int[] expected = new int[]{338, 38, 991};
        var result = solution.sortJumbled(mapping, nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] mapping = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] nums = new int[]{789, 456, 123};
        int[] expected = new int[]{123, 456, 789};
        var result = solution.sortJumbled(mapping, nums);
        assertThat(result).isEqualTo(expected);
    }

}
