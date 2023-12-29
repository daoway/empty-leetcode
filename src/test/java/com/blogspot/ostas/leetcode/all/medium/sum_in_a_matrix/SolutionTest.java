package com.blogspot.ostas.leetcode.all.medium.sum_in_a_matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [[7,2,1],[6,4,2],[6,5,3],[3,2,1]]
    Output: 15
    Explanation: In the first operation, we remove 7, 6, 6, and 3. We then add 7 to our score. Next, we remove 2, 4, 5, and 2. We add 5 to our score. Lastly, we remove 1, 2, 3, and 1. We add 3 to our score. Thus, our final score is 7 + 5 + 3 = 15.
    Example 2:
    Input: nums = [[1]]
    Output: 1
    Explanation: We remove 1 and add it to the answer. We return 1.
      Constraints:
    1 <= nums.length <= 300
    1 <= nums[i].length <= 500
    0 <= nums[i][j] <= 103
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] nums = new int[][]{{7, 2, 1}, {6, 4, 2}, {6, 5, 3}, {3, 2, 1}};
        int expected = 15;
        var result = solution.matrixSum(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] nums = new int[][]{{1}};
        int expected = 1;
        var result = solution.matrixSum(nums);
        assertThat(result).isEqualTo(expected);
    }

}
