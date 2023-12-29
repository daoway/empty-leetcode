package com.blogspot.ostas.leetcode.all.medium.two_sum_ii_input_array_is_sorted;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: numbers = [2,7,11,15], target = 9
    Output: [1,2]
    Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
    Example 2:
    Input: numbers = [2,3,4], target = 6
    Output: [1,3]
    Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
    Example 3:
    Input: numbers = [-1,0], target = -1
    Output: [1,2]
    Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
      Constraints:
    2 <= numbers.length <= 3 * 104
    -1000 <= numbers[i] <= 1000
    numbers is sorted in non-decreasing order.
    -1000 <= target <= 1000
    The tests are generated such that there is exactly one solution.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{1, 2};
        var result = solution.twoSum(numbers, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] numbers = new int[]{2, 3, 4};
        int target = 6;
        int[] expected = new int[]{1, 3};
        var result = solution.twoSum(numbers, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] numbers = new int[]{-1, 0};
        int target = -1;
        int[] expected = new int[]{1, 2};
        var result = solution.twoSum(numbers, target);
        assertThat(result).isEqualTo(expected);
    }

}
