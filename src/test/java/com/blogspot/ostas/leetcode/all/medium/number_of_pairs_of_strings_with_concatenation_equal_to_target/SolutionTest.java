package com.blogspot.ostas.leetcode.all.medium.number_of_pairs_of_strings_with_concatenation_equal_to_target;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = ["777","7","77","77"], target = "7777"
    Output: 4
    Explanation: Valid pairs are:
    - (0, 1): "777" + "7"
    - (1, 0): "7" + "777"
    - (2, 3): "77" + "77"
    - (3, 2): "77" + "77"
    Example 2:
    Input: nums = ["123","4","12","34"], target = "1234"
    Output: 2
    Explanation: Valid pairs are:
    - (0, 1): "123" + "4"
    - (2, 3): "12" + "34"
    Example 3:
    Input: nums = ["1","1","1"], target = "11"
    Output: 6
    Explanation: Valid pairs are:
    - (0, 1): "1" + "1"
    - (1, 0): "1" + "1"
    - (0, 2): "1" + "1"
    - (2, 0): "1" + "1"
    - (1, 2): "1" + "1"
    - (2, 1): "1" + "1"
      Constraints:
    2 <= nums.length <= 100
    1 <= nums[i].length <= 100
    2 <= target.length <= 100
    nums[i] and target consist of digits.
    nums[i] and target do not have leading zeros.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] nums = new String[]{"777", "7", "77", "77"};
        String target = "7777";
        int expected = 4;
        var result = solution.numOfPairs(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] nums = new String[]{"123", "4", "12", "34"};
        String target = "1234";
        int expected = 2;
        var result = solution.numOfPairs(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] nums = new String[]{"1", "1", "1"};
        String target = "11";
        int expected = 6;
        var result = solution.numOfPairs(nums, target);
        assertThat(result).isEqualTo(expected);
    }

}
