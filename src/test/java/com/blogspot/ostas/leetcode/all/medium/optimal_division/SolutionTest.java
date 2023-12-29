package com.blogspot.ostas.leetcode.all.medium.optimal_division;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1000,100,10,2]
    Output: "1000/(100/10/2)"
    Explanation: 1000/(100/10/2) = 1000/((100/10)/2) = 200
    However, the bold parenthesis in "1000/((100/10)/2)" are redundant since they do not influence the operation priority.
    So you should return "1000/(100/10/2)".
    Other cases:
    1000/(100/10)/2 = 50
    1000/(100/(10/2)) = 50
    1000/100/10/2 = 0.5
    1000/100/(10/2) = 2
    Example 2:
    Input: nums = [2,3,4]
    Output: "2/(3/4)"
    Explanation: (2/(3/4)) = 8/3 = 2.667
    It can be shown that after trying all possibilities, we cannot get an expression with evaluation greater than 2.667
      Constraints:
    1 <= nums.length <= 10
    2 <= nums[i] <= 1000
    There is only one optimal division for the given input.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1000, 100, 10, 2};
        String expected = "1000/(100/10/2)";
        var result = solution.optimalDivision(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 4};
        String expected = "2/(3/4)";
        var result = solution.optimalDivision(nums);
        assertThat(result).isEqualTo(expected);
    }

}
