package com.blogspot.ostas.leetcode.all.medium.rearrange_array_elements_by_sign;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,1,-2,-5,2,-4]
    Output: [3,-2,1,-5,2,-4]
    Explanation:
    The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
    The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
    Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.
    Example 2:
    Input: nums = [-1,1]
    Output: [1,-1]
    Explanation:
    1 is the only positive integer and -1 the only negative integer in nums.
    So nums is rearranged to [1,-1].
      Constraints:
    2 <= nums.length <= 2 * 105
    nums.length is even
    1 <= |nums[i]| <= 105
    nums consists of equal number of positive and negative integers.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 1, -2, -5, 2, -4};
        int[] expected = new int[]{3, -2, 1, -5, 2, -4};
        var result = solution.rearrangeArray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-1, 1};
        int[] expected = new int[]{1, -1};
        var result = solution.rearrangeArray(nums);
        assertThat(result).isEqualTo(expected);
    }

}
