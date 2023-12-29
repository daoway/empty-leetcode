package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_operations_to_make_all_array_elements_equal_to_one_;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,6,3,4]
    Output: 4
    Explanation: We can do the following operations:
    - Choose index i = 2 and replace nums[2] with gcd(3,4) = 1. Now we have nums = [2,6,1,4].
    - Choose index i = 1 and replace nums[1] with gcd(6,1) = 1. Now we have nums = [2,1,1,4].
    - Choose index i = 0 and replace nums[0] with gcd(2,1) = 1. Now we have nums = [1,1,1,4].
    - Choose index i = 2 and replace nums[3] with gcd(1,4) = 1. Now we have nums = [1,1,1,1].
    Example 2:
    Input: nums = [2,10,6,14]
    Output: -1
    Explanation: It can be shown that it is impossible to make all the elements equal to 1.
      Constraints:
    2 <= nums.length <= 50
    1 <= nums[i] <= 106
      Follow-up:
    The O(n) time complexity solution works, but could you find an O(1) constant time complexity solution?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 6, 3, 4};
        int expected = 4;
        var result = solution.minOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 10, 6, 14};
        int expected = -1;
        var result = solution.minOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

}
