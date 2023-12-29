package com.blogspot.ostas.leetcode.all.easy.longest_subsequence_with_limited_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,5,2,1], queries = [3,10,21]
    Output: [2,3,4]
    Explanation: We answer the queries as follows:
    - The subsequence [2,1] has a sum less than or equal to 3. It can be proven that 2 is the maximum size of such a subsequence, so answer[0] = 2.
    - The subsequence [4,5,1] has a sum less than or equal to 10. It can be proven that 3 is the maximum size of such a subsequence, so answer[1] = 3.
    - The subsequence [4,5,2,1] has a sum less than or equal to 21. It can be proven that 4 is the maximum size of such a subsequence, so answer[2] = 4.
    Example 2:
    Input: nums = [2,3,4,5], queries = [1]
    Output: [0]
    Explanation: The empty subsequence is the only subsequence that has a sum less than or equal to 1, so answer[0] = 0.
      Constraints:
    n == nums.length
    m == queries.length
    1 <= n, m <= 1000
    1 <= nums[i], queries[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 5, 2, 1};
        int[] queries = new int[]{3, 10, 21};
        int[] expected = new int[]{2, 3, 4};
        var result = solution.answerQueries(nums, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 4, 5};
        int[] queries = new int[]{1};
        int[] expected = new int[]{0};
        var result = solution.answerQueries(nums, queries);
        assertThat(result).isEqualTo(expected);
    }

}
