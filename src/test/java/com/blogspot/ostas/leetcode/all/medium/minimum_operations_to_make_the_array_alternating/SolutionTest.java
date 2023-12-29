package com.blogspot.ostas.leetcode.all.medium.minimum_operations_to_make_the_array_alternating;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,1,3,2,4,3]
    Output: 3
    Explanation:
    One way to make the array alternating is by converting it to [3,1,3,1,3,1].
    The number of operations required in this case is 3.
    It can be proven that it is not possible to make the array alternating in less than 3 operations.
    Example 2:
    Input: nums = [1,2,2,2,2]
    Output: 2
    Explanation:
    One way to make the array alternating is by converting it to [1,2,1,2,1].
    The number of operations required in this case is 2.
    Note that the array cannot be converted to [2,2,2,2,2] because in this case nums[0] == nums[1] which violates the conditions of an alternating array.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 1, 3, 2, 4, 3};
        int expected = 3;
        var result = solution.minimumOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 2, 2, 2};
        int expected = 2;
        var result = solution.minimumOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

}
